package com.Shabbir.api.center.model.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.Shabbir.api.center.model.DTO.CenterDTO;
import com.Shabbir.api.center.model.DTO.FacultyDTO;
import com.Shabbir.api.center.model.DTO.FacultyTimeDTO;
import com.Shabbir.api.center.model.DTO.StudentsDTO;
import com.Shabbir.api.center.model.DTO.entity.Center;
import com.Shabbir.api.center.model.DTO.entity.Faculty;
import com.Shabbir.api.center.model.DTO.entity.FacultyTime;
import com.Shabbir.api.center.model.DTO.entity.Students;
@Component
public class ConvertBeanToDTO {

	 public CenterDTO convertCenterToCenterDTO(Center center) {
	        CenterDTO centerDTO = new CenterDTO();
	        centerDTO.setId(center.getId());
	        centerDTO.setName(center.getName());
	        centerDTO.setBranch(center.getBranch());
	        centerDTO.setLocation(center.getLocation());

	        Set<FacultyDTO> facultyDTOs = new HashSet<>();
	        for (Faculty faculty : center.getFaculties()) {
	            facultyDTOs.add(convertFacultyToFacultyDTO(faculty));
	        }
	        centerDTO.setFaculties(facultyDTOs);

	        List<StudentsDTO> studentsDTOs = new ArrayList<>();
	        for (Students students : center.getStudents()) {
	            studentsDTOs.add(convertStudentToStudentDTO(students));
	        }
	        centerDTO.setStudents(studentsDTOs);

	        return centerDTO;
	    }

	    public FacultyDTO convertFacultyToFacultyDTO(Faculty faculty) {
	        FacultyDTO facultyDTO = new FacultyDTO();
	        facultyDTO.setId(faculty.getId());
	        facultyDTO.setName(faculty.getName());
	        facultyDTO.setSubject(faculty.getSubject());
	        // Convert FacultyTime to FacultyTimeDTO and set it
	        facultyDTO.setFacultyTime(convertFacultyTimeToFacultyTimeDTO(faculty.getFacultyTime()));
	        facultyDTO.setAddress(faculty.getAddress());
	        facultyDTO.setSalaray(faculty.getSalaray());
	        return facultyDTO;
	    }

	    public FacultyTimeDTO convertFacultyTimeToFacultyTimeDTO(FacultyTime facultyTime) {
	        FacultyTimeDTO facultyTimeDTO = new FacultyTimeDTO();
	        facultyTimeDTO.setId(facultyTime.getId());
	        facultyTimeDTO.setStartTime(facultyTime.getStartTime());
	        facultyTimeDTO.setEndTime(facultyTime.getEndTime());
	        return facultyTimeDTO;
	    }

	    public List<StudentsDTO> convertStudentsToStudentsDTO(List<Students> studentsList) {
	        List<StudentsDTO> studentsDTOs = new ArrayList<>();
	        for (Students students : studentsList) {
	            studentsDTOs.add(convertStudentToStudentDTO(students));
	        }
	        return studentsDTOs;
	    }

	    public StudentsDTO convertStudentToStudentDTO(Students students) {
	        StudentsDTO studentsDTO = new StudentsDTO();
	        studentsDTO.setId(students.getId());
	        studentsDTO.setName(students.getName());
	        studentsDTO.setSubject(students.getSubject());
	        studentsDTO.setIsLaptopThere(students.getIsLaptopThere());
	        studentsDTO.setHigtherEducation(students.getHigtherEducation());
	        studentsDTO.setFees(students.getFees());
	        studentsDTO.setYearOfPass(students.getYearOfPass());
	        studentsDTO.setAadharNumber(students.getAadharNumber());
	        studentsDTO.setAddress(students.getAddress());
	        studentsDTO.setPhoneNumber(students.getPhoneNumber());
	        studentsDTO.setEmail(students.getEmail());
	        return studentsDTO;
	    }
}
