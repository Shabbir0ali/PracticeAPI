package com.Shabbir.api.center.model.DTO;

import java.util.Objects;
public class FacultyDTO {

	private long id;
	private String name;
	private String subject;
	private FacultyTimeDTO facultyTime;
	private String address;
	private float salaray;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public FacultyTimeDTO getFacultyTime() {
		return facultyTime;
	}
	public void setFacultyTime(FacultyTimeDTO facultyTime) {
		this.facultyTime = facultyTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalaray() {
		return salaray;
	}
	public void setSalaray(float salaray) {
		this.salaray = salaray;
	}
	public FacultyDTO(long id, String name, String subject, FacultyTimeDTO facultyTime, String address, float salaray) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.facultyTime = facultyTime;
		this.address = address;
		this.salaray = salaray;
	}
	public FacultyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FacultyDTO [id=" + id + ", name=" + name + ", subject=" + subject + ", facultyTime=" + facultyTime
				+ ", address=" + address + ", salaray=" + salaray + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, facultyTime, id, name, salaray, subject);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacultyDTO other = (FacultyDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(facultyTime, other.facultyTime)
				&& id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salaray) == Float.floatToIntBits(other.salaray)
				&& Objects.equals(subject, other.subject);
	}
	
	
}
