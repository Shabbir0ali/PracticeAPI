package com.Shabbir.api.center.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shabbir.api.center.model.DTO.CenterDTO;
import com.Shabbir.api.center.model.DTO.entity.Center;
import com.Shabbir.api.center.model.repositry.CenterRepositry;
import com.Shabbir.api.center.model.service.CenterService;

@Service
public class CenterServiceImpl implements CenterService{

	@Autowired
	private ConverterDTO_ToBean converterDTO_ToBean;
	@Autowired
	private CenterRepositry centerRepositry;
	@Autowired
	private ConvertBeanToDTO beanToDTO;
	
	@Override
	public CenterDTO saveCenter(CenterDTO centerDTO) {
		Center convertCenterDTOToCenter = converterDTO_ToBean.convertCenterDTOToCenter(centerDTO);
		Center save = centerRepositry.save(convertCenterDTOToCenter);
		CenterDTO convertCenterToCenterDTO = beanToDTO.convertCenterToCenterDTO(save);
		return convertCenterToCenterDTO;
	}

	@Override
	public CenterDTO getSingle(String name) {
		Center findByName = centerRepositry.findByName(name);
		CenterDTO convertCenterToCenterDTO = beanToDTO.convertCenterToCenterDTO(findByName);
		
		
		return convertCenterToCenterDTO;
	}

	@Override
	public List<CenterDTO> getAll() {
		List<Center> list = this.centerRepositry.findAll();
		List<CenterDTO> list1 = new ArrayList<>();
		for (Center centerDTO : list) {
			CenterDTO dto = this.beanToDTO.convertCenterToCenterDTO(centerDTO);
			list1.add(dto);
		}
		return list1;
	}

	@Override
	public CenterDTO update(CenterDTO cent, int id) {
		Center findById = this.centerRepositry.findById(id);
		CenterDTO dto =null;
		if(findById==null) {
			return null;
		}
		else {
			Center center = this.converterDTO_ToBean.convertCenterDTOToCenter(cent);
			center.setId(id);
			Center save = this.centerRepositry.save(center);
			dto = this.beanToDTO.convertCenterToCenterDTO(save);
		}
		return dto;
	}

	@Override
	public void delete(int id) {
		Center findById = this.centerRepositry.findById(id);
		this.centerRepositry.delete(findById);
		
	}
}