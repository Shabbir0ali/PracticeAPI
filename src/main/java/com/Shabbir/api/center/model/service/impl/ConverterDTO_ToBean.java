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
public class ConverterDTO_ToBean {

	public Center convertCenterDTOToCenter(CenterDTO centerDTO) {
        Center center = new Center();
        center.setId(centerDTO.getId());
        center.setName(centerDTO.getName());
        center.setBranch(centerDTO.getBranch());
        center.setLocation(centerDTO.getLocation());

        Set<Faculty> faculties = new HashSet<>();
        for (FacultyDTO facultyDTO : centerDTO.getFaculties()) {
            faculties.add(convertFacultyDTOToFaculty(facultyDTO));
        }
        center.setFaculties(faculties);

        List<Students> students = new ArrayList<>();
        for (StudentsDTO studentsDTO : centerDTO.getStudents()) {
            students.add(convertStudentDTOToStudent(studentsDTO));
        }
        center.setStudents(students);

        return center;
    }

    public Faculty convertFacultyDTOToFaculty(FacultyDTO facultyDTO) {
        Faculty faculty = new Faculty();
        faculty.setId(facultyDTO.getId());
        faculty.setName(facultyDTO.getName());
        faculty.setSubject(facultyDTO.getSubject());
        // Convert FacultyTimeDTO to FacultyTime and set it
        faculty.setFacultyTime(convertFacultyTimeDTOToFacultyTime(facultyDTO.getFacultyTime()));
        faculty.setAddress(facultyDTO.getAddress());
        faculty.setSalaray(facultyDTO.getSalaray());
        return faculty;
       
    }

    
    public FacultyTime convertFacultyTimeDTOToFacultyTime(FacultyTimeDTO facultyTimeDTO) {
        FacultyTime facultyTime = new FacultyTime();
        facultyTime.setId(facultyTimeDTO.getId());
        facultyTime.setStartTime(facultyTimeDTO.getStartTime());
        facultyTime.setEndTime(facultyTimeDTO.getEndTime());
        return facultyTime;
    }

    public List<Students> convertStudentsDTOsToStudents(List<StudentsDTO> studentsDTOs) {
        List<Students> studentsList = new ArrayList<>();
        for (StudentsDTO studentsDTO : studentsDTOs) {
            studentsList.add(convertStudentDTOToStudent(studentsDTO));
        }
        return studentsList;
    }

    public Students convertStudentDTOToStudent(StudentsDTO studentsDTO) {
        Students students = new Students();
        students.setId(studentsDTO.getId());
        students.setName(studentsDTO.getName());
        students.setSubject(studentsDTO.getSubject());
        students.setIsLaptopThere(studentsDTO.getIsLaptopThere());
        students.setHigtherEducation(studentsDTO.getHigtherEducation() );
        students.setFees(studentsDTO.getFees());
        students.setYearOfPass(studentsDTO.getYearOfPass());
        students.setAadharNumber(studentsDTO.getAadharNumber());
        students.setAddress(studentsDTO.getAddress());
        students.setPhoneNumber(studentsDTO.getPhoneNumber());
        students.setEmail(studentsDTO.getEmail());
        return students;
    }
}