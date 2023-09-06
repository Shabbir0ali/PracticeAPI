package com.Shabbir.api.center.model.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shabbir.api.center.model.DTO.entity.Center;

public interface CenterRepositry extends JpaRepository<Center, Long>{

	public Center findByName(String name);
	public Center findById(int id);
}
