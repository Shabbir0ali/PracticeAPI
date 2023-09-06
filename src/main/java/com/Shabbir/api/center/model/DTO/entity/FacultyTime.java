
package com.Shabbir.api.center.model.DTO.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "FACULTY_TIME")
public class FacultyTime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FACULTY_TIME_ID")
	private int id;
	@Column(name = "FACULTYS_START_TIME")
	private String startTime;
	@Column(name = "FACULTYS_END_TIME")
	private String endTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public FacultyTime(int id, String startTime, String endTime) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public FacultyTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FacultyTime [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(endTime, id, startTime);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacultyTime other = (FacultyTime) obj;
		return Objects.equals(endTime, other.endTime) && id == other.id && Objects.equals(startTime, other.startTime);
	}
}