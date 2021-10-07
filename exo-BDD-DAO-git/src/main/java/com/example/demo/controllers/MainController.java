package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonDAO;
import com.example.demo.entities.Person;

@RestController
public class MainController {
	
	private PersonDAO personDAO;
	
	private PersonDAO getPersonDAO() {
		return personDAO;
	}

	@Autowired
	private void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@GetMapping("/person")
	public Person requestPerson(
			@RequestParam(name = "method", required = true, defaultValue = "id") String method,
			@RequestParam(name = "value", required = true) String value
		) {
		switch(method) {
			case "id": {
				Optional<Person> personOptional = getPersonDAO().findIdInPerson(Long.valueOf(value));
				return personOptional.orElse(new Person());
			}
		}
		return new Person();
	}
	
	@GetMapping("/persons")
	public List<Person> requestPersons(
			@RequestParam(name = "method", required = true, defaultValue = "all") String method,
			@RequestParam(name = "value", required = true) String value
		) {
		switch(method) {
			case "all": {
				return getPersonDAO().findAllPersons();
			}
			
			case "name-like": {
				return getPersonDAO().findByFullNameLike(value);
			}
			
			case "salary-greater-than": {
				return getPersonDAO().findBySalaryGreaterThan(Float.valueOf(value));
			}
			
			case "id-greater-than": {
				return getPersonDAO().findByIdGreaterThan(Long.valueOf(value));
			}
		}
		return null;
	}
}