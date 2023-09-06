package com.Shabbir.api.center.model.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shabbir.api.center.model.DTO.entity.Students;

public interface StudentsRepositry extends JpaRepository<Students,Long>{

}
