package com.xworkz.mock.dto;

import java.io.Serializable;
import java.util.Objects;

public class PersonDTO implements Serializable {

	private String name;
	private int age;
	private String emailID;
	private String education;
	private String district;
	private String state;
	private String country;
	private long pinCode;
	private String fatherName;
	private String motherName;

	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(String name, int age, String emailID, String education, String district, String state,
			String country, long pinCode, String fatherName, String motherName) {
		super();
		this.name = name;
		this.age = age;
		this.emailID = emailID;
		this.education = education;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", emailID=" + emailID + ", education=" + education
				+ ", district=" + district + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, country, district, education, emailID, fatherName, motherName, name, pinCode, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PersonDTO)) {
			return false;
		}
		PersonDTO other = (PersonDTO) obj;
		return age == other.age && Objects.equals(country, other.country) && Objects.equals(district, other.district)
				&& Objects.equals(education, other.education) && Objects.equals(emailID, other.emailID)
				&& Objects.equals(fatherName, other.fatherName) && Objects.equals(motherName, other.motherName)
				&& Objects.equals(name, other.name) && pinCode == other.pinCode && Objects.equals(state, other.state);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

}
