package com.xworkz.mock.service;

import com.xworkz.mock.dto.PersonDTO;
import com.xworkz.mock.repository.PersonRepository;

import static com.xworkz.mock.util.ValidationUtil.*;

import java.util.Optional;

public class PersonServiceimpl implements PersonService {

	private PersonRepository personRepository;

	public PersonServiceimpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public boolean validateAndThenSave(PersonDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			int age = dto.getAge();
			String country = dto.getCountry();
			String district = dto.getDistrict();
			String education = dto.getEducation();
			String emailID = dto.getEmailID();
			String fatherName = dto.getFatherName();
			String motherName = dto.getMotherName();
			String name = dto.getName();
			long pinCode = dto.getPinCode();
			String state = dto.getState();

			boolean validCountry = false;
			boolean validDistrict = false;
			boolean validEducation = false;
			boolean validEmailID = false;
			boolean validAge = false;
			boolean validFatherName = false;
			boolean validMotherName = false;
			boolean validName = false;
			boolean validPinCode = false;
			boolean validState = false;

			if (validString(name)) {
				System.out.println("Name is valid");
				validName = true;
			} else {
				System.err.println("Name is invalid");
			}
			if (validString(motherName)) {
				System.out.println("Mother name is valid");
				validMotherName = true;
			} else {
				System.err.println("Mother name is invalid");
			}
			if (validString(fatherName)) {
				System.out.println("Father name is valid");
				validFatherName = true;
			} else {
				System.err.println("father name is invalid");
			}
			if (validString(state)) {
				System.out.println("State is valid");
				validState = true;
			} else {
				System.err.println("State is invalid");
			}
			if (validString(emailID)) {
				System.out.println("emailID is valid");
				validEmailID = true;
			} else {
				System.err.println("emailID is invalid");
			}
			if (validString(education)) {
				System.out.println("education is valid");
				validEducation = true;
			} else {
				System.err.println("education is invalid");
			}
			if (validString(district)) {
				System.out.println("district is valid");
				validDistrict = true;
			} else {
				System.err.println("district is invalid");
			}
			if (validString(country)) {
				System.out.println("country is valid");
				validCountry = true;
			} else {
				System.err.println("country is invalid");
			}
			if (validInt(age)) {
				System.out.println("age is valid");
				validAge = true;
			} else {
				System.err.println("age is invalid");
			}
			if (validLong(pinCode)) {
				System.out.println("pinCode is valid");
				validPinCode = true;
			} else {
				System.err.println("pinCode is invalid");
			}
			if (validFlag(validAge && validCountry && validDistrict && validEducation && validEmailID && validFatherName
					&& validMotherName && validName && validPinCode && validState)) {
				boolean saved = this.personRepository.save(dto);
				return saved;
			} else {
				System.err.println("invalid data");
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public Optional<PersonDTO> findByEducationAndName(String education, String name) {
		return this.personRepository.findByEducationAndName(education, name);
	}

}
