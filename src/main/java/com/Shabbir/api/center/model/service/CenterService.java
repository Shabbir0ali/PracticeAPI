package com.Shabbir.api.center.model.service;

import java.util.List;

import com.Shabbir.api.center.model.DTO.CenterDTO;

public interface CenterService {

	CenterDTO saveCenter(CenterDTO centerDTO);

	CenterDTO getSingle(String name);

	List<CenterDTO> getAll();

	CenterDTO update(CenterDTO cent, int id);

	void delete(int id);

	
}
