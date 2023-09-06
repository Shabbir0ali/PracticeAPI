package com.Shabbir.api.center.model.DTO.entity;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "CENTER_FACULTY")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FACULTY_ID")
	private long id;
	@Column(name = "FACULTY_NAME",nullable = false,length = 50)
	private String name;
	@Column(name = "FACULTY_SUBJECTS",length = 50,nullable = false)
	private String subject;
	@OneToOne(cascade = CascadeType.ALL,targetEntity = FacultyTime.class)
	@JoinColumn(name = "FACULTY_TIME_ID")
	private FacultyTime facultyTime;
	@Column(name = "FACULTY_ADDRESS")
	private String address;
	@Column(name = "FACULTY_SALARAY",nullable = false)
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
	public FacultyTime getFacultyTime() {
		return facultyTime;
	}
	public void setFacultyTime(FacultyTime facultyTime) {
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
	public Faculty(long id, String name, String subject, FacultyTime facultyTime, String address, float salaray) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.facultyTime = facultyTime;
		this.address = address;
		this.salaray = salaray;
	}
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", subject=" + subject + ", facultyTime=" + facultyTime
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
		Faculty other = (Faculty) obj;
		return Objects.equals(address, other.address) && Objects.equals(facultyTime, other.facultyTime)
				&& id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salaray) == Float.floatToIntBits(other.salaray)
				&& Objects.equals(subject, other.subject);
	}
	
}