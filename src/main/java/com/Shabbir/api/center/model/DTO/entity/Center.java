package com.Shabbir.api.center.model.DTO.entity;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "CENTERS")
public class Center {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CENTER_ID")
	private long id;
	@Column(nullable = false, name = "CENTER_NAME", length = 50)
	private String name;
	@Column(name = "BRACH_NAME", length = 20, unique = true, nullable = false)
	private String branch;
	@Column(name = "CENTER_LOCATION", unique = true, nullable = false)
	private String location;
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Faculty.class)
	@JoinColumn(name = "FACULTIES_ID", nullable = false)
	private Set<Faculty> faculties;
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Students.class)
	@JoinColumn(name = "STUDENT_ID", nullable = false)
	private List<Students> students;

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

	public Set<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(Set<Faculty> faculties) {
		this.faculties = faculties;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public Center(long id, String name, String branch, String location, Set<Faculty> faculties,
			List<Students> students) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.location = location;
		this.faculties = faculties;
		this.students = students;
	}

	public Center() {
		super();
	}

	@Override
	public String toString() {
		return "Center [id=" + id + ", name=" + name + ", branch=" + branch + ", location=" + location + ", faculties="
				+ faculties + ", students=" + students + "]";
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
		Center other = (Center) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(faculties, other.faculties) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(students, other.students);
	}
}