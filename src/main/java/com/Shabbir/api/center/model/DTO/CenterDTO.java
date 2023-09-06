package com.Shabbir.api.center.model.DTO;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class CenterDTO {

	private long id;
	private String name;
	private String branch;
	private String location;
	private Set<FacultyDTO> faculties;
	private List<StudentsDTO> students;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<FacultyDTO> getFaculties() {
		return faculties;
	}
	public void setFaculties(Set<FacultyDTO> faculties) {
		this.faculties = faculties;
	}
	public List<StudentsDTO> getStudents() {
		return students;
	}
	public void setStudents(List<StudentsDTO> students) {
		this.students = students;
	}
	public CenterDTO(long id, String name, String branch, String location, Set<FacultyDTO> faculties,
			List<StudentsDTO> students) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.location = location;
		this.faculties = faculties;
		this.students = students;
	}
	public CenterDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CenterDTO [id=" + id + ", name=" + name + ", branch=" + branch + ", location=" + location
				+ ", faculties=" + faculties + ", students=" + students + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(branch, faculties, id, location, name, students);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CenterDTO other = (CenterDTO) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(faculties, other.faculties) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(students, other.students);
	}
}