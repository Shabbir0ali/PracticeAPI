package com.Shabbir.api.center.model.DTO.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "STUDENT_DETAIL")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "STUDENT_NAME",length = 30)
	private String name;
	@Column(name = "SUBJECTS",length = 255)
	private String subject;
	@Column(name = "IS_LAPTOP_THERE",length = 5)
	private String isLaptopThere;
	@Column(name = "HIGHER_EDUCATION",length = 50)
	private String higtherEducation;
	@Column(name = "STUDENT_FEES")
	private float fees;
	@Column(name = "YEAR_OF_PASS",length = 30)
	private String yearOfPass;
	@Column(name = "AADHAR_NUMBER",unique = true,nullable = false,length = 12)
	private long aadharNumber;
	@Column(name = "ADDRESS",length = 300,nullable = false)
	private String address;
	@Column(name = "PHONE_NUMBER",length = 10,unique = true,nullable = false)
	private long phoneNumber;
	@Column(name = "EMAIL",unique = true,length = 80,nullable = false)
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
	public Students(long id, String name, String subject, String isLaptopThere, String higtherEducation, float fees,
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
	public Students() {
		super();
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", subject=" + subject + ", isLaptopThere=" + isLaptopThere
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
		Students other = (Students) obj;
		return aadharNumber == other.aadharNumber && Objects.equals(address, other.address)
				&& Objects.equals(email, other.email) && Float.floatToIntBits(fees) == Float.floatToIntBits(other.fees)
				&& Objects.equals(higtherEducation, other.higtherEducation) && id == other.id
				&& Objects.equals(isLaptopThere, other.isLaptopThere) && Objects.equals(name, other.name)
				&& phoneNumber == other.phoneNumber && Objects.equals(subject, other.subject)
				&& Objects.equals(yearOfPass, other.yearOfPass);
	}	
}