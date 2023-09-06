package com.Shabbir.api.center.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Shabbir.api.center.model.DTO.CenterDTO;
import com.Shabbir.api.center.model.service.CenterService;

@RestController
@RequestMapping("/center")
public class CenterController {

	@Autowired
	private CenterService centerService;

	@PostMapping("")
	public ResponseEntity<CenterDTO> save(@RequestBody CenterDTO centerDTO) {
		System.err.println(centerDTO);
		try {
			CenterDTO c = this.centerService.saveCenter(centerDTO);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//			ResponseEntity.of(Optional.of(book1));
		}
	}

	@GetMapping("/{name}")
	public ResponseEntity<CenterDTO> fetchSingle(@PathVariable("name") String name) {
		try {
			CenterDTO c = this.centerService.getSingle(name);
			return ResponseEntity.of(Optional.of(c));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	@GetMapping("")
	public ResponseEntity<List<CenterDTO>> getAll(){
			

		try {
			List<CenterDTO> as = centerService.getAll();
			return ResponseEntity.of(Optional.of(as));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	@PutMapping("/{id}")
	public String update(@PathVariable("id") int id , @RequestBody CenterDTO cent) {
		CenterDTO up = centerService.update(cent,id);
		if(up==null) {
			return "Id donse'nt exist check your id";
		}else {
			return "Updated succsessfully";
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id){
		this.centerService.delete(id);
		return null;
	}

}