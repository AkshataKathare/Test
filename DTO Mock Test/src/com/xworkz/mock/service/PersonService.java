package com.xworkz.mock.service;

import java.util.Optional;

import com.xworkz.mock.dto.PersonDTO;

public interface PersonService {

	boolean validateAndThenSave(PersonDTO dto);

	Optional<PersonDTO> findByEducationAndName(String education, String name);

}
