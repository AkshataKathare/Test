package com.xworkz.mock.repository;

import java.util.Optional;

import com.xworkz.mock.dto.PersonDTO;

public interface PersonRepository {

	boolean save(PersonDTO dto);

	Optional<PersonDTO> findByEducationAndName(String education, String name);
}
