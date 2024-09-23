package ru.elreni.spring.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ru.elreni.spring.dao.PersonDAO;
import ru.elreni.spring.models.Person;

@Component
public class PersonValidator implements Validator {	
	
	PersonDAO personDAO;	
	
	@Autowired
	public PersonValidator(PersonDAO personDAO) {
		super();
		this.personDAO = personDAO;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Person person = (Person) target;
		
		if (personDAO.get(person.getEmail()).isPresent()) {
			errors.rejectValue("email", "", "This email is already taken");
		}
	}

}
