package com.Shabbir.api.center.model.DTO;

import java.util.Objects;

public class StudentsDTO {

	private long id;
	private String name;
	private String subject;
	private String isLaptopThere;
	private String higtherEducation;
	private float fees;
	private String yearOfPass;
	private long aadharNumber;
	private String address;
	private long phoneNumber;
	private String email;
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
	public String getIsLaptopThere() {
		return isLaptopThere;
	}
	public void setIsLaptopThere(String isLaptopThere) {
		this.isLaptopThere = isLaptopThere;
	}
	public String getHigtherEducation() {
		return higtherEducation;
	}
	public void setHigtherEducation(String higtherEducation) {
		this.higtherEducation = higtherEducation;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getYearOfPass() {
		return yearOfPass;
	}
	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StudentsDTO(long id, String name, String subject, String isLaptopThere, String higtherEducation, float fees,
			String yearOfPass, long aadharNumber, String address, long phoneNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.isLaptopThere = isLaptopThere;
		this.higtherEducation = higtherEducation;
		this.fees = fees;
		this.yearOfPass = yearOfPass;
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public StudentsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentsDTO [id=" + id + ", name=" + name + ", subject=" + subject + ", isLaptopThere=" + isLaptopThere
				+ ", higtherEducation=" + higtherEducation + ", fees=" + fees + ", yearOfPass=" + yearOfPass
				+ ", aadharNumber=" + aadharNumber + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(aadharNumber, address, email, fees, higtherEducation, id, isLaptopThere, name, phoneNumber,
				subject, yearOfPass);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentsDTO other = (StudentsDTO) obj;
		return aadharNumber == other.aadharNumber && Objects.equals(address, other.address)
				&& Objects.equals(email, other.email) && Float.floatToIntBits(fees) == Float.floatToIntBits(other.fees)
				&& Objects.equals(higtherEducation, other.higtherEducation) && id == other.id
				&& Objects.equals(isLaptopThere, other.isLaptopThere) && Objects.equals(name, other.name)
				&& phoneNumber == other.phoneNumber && Objects.equals(subject, other.subject)
				&& Objects.equals(yearOfPass, other.yearOfPass);
	}
}