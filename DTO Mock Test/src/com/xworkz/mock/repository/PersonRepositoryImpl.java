package com.xworkz.mock.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.mock.dto.PersonDTO;

public class PersonRepositoryImpl implements PersonRepository {

	private Collection<PersonDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(PersonDTO dto) {
		return this.dtos.add(dto);
	}

	@Override
	public Optional<PersonDTO> findByEducationAndName(String education, String name) {
		return this.dtos.stream()
				.filter(e -> e.getEducation().equalsIgnoreCase(education) && e.getName().equalsIgnoreCase(name))
				.findFirst();
	}

}
