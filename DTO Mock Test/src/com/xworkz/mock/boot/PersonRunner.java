package com.xworkz.mock.boot;

import java.util.Optional;

import com.xworkz.mock.dto.PersonDTO;
import com.xworkz.mock.repository.PersonRepository;
import com.xworkz.mock.repository.PersonRepositoryImpl;
import com.xworkz.mock.service.PersonService;
import com.xworkz.mock.service.PersonServiceimpl;

public class PersonRunner {

	public static void main(String[] args) {

		PersonDTO person = new PersonDTO("Akshata", 21, "akshata@gmail.com", "Bachelor of Science", "Dharwad",
				"Karnataka", "India", 580001, "Dattatraya", "Vimal");

		PersonDTO person1 = new PersonDTO("Anita", 21, "anita@gmail.com", "Bachelor of Science", "Tungal", "Karnataka",
				"India", 580002, "XYZYU", "ABCHU");

		PersonRepository personRepository = new PersonRepositoryImpl();
		PersonService personService = new PersonServiceimpl(personRepository);
		boolean saved1 = personService.validateAndThenSave(person);
		System.out.println("saved :" + saved1);

		System.out.println("=================");

		boolean saved2 = personService.validateAndThenSave(person1);
		System.out.println("saved :" + saved2);

		System.out.println("=================");

		Optional<PersonDTO> opt = personService.findByEducationAndName("bachelor of Science", "Anita");
		if (opt.isPresent()) {
			System.out.println(opt.get());
		} else {
			System.out.println("this dto is not present");
		}

		System.out.println("=================");

		Optional<PersonDTO> opt2 = personService.findByEducationAndName("Bachelor of Science", "akshata");
		if (opt.isPresent()) {
			System.out.println(opt2.get());
		} else {
			System.out.println("this dto is not present");
		}
	}
}
