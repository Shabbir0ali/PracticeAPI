package com.Shabbir.api.center.model.DTO;

import java.util.Objects;

public class FacultyTimeDTO {

	private int id;
	private String startTime;
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
	public FacultyTimeDTO(int id, String startTime, String endTime) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public FacultyTimeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FacultyTimeDTO [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
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
		FacultyTimeDTO other = (FacultyTimeDTO) obj;
		return Objects.equals(endTime, other.endTime) && id == other.id && Objects.equals(startTime, other.startTime);
	}
	
}