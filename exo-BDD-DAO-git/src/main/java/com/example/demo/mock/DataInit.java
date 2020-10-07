package com.example.demo.mock;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PersonDAO;
import com.example.demo.entities.Person;
 
@Component
public class DataInit implements ApplicationRunner {
 
    private PersonDAO personDAO;
 
    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 
    @Autowired
    public DataInit(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
 
    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = personDAO.count();
 
        if (count == 0) {
    		createPerson("John", "1980-11-11",1589.1f);
    		createPerson("Smith", "1985-11-11",2041);
    		createPerson("Marc", "1990-11-11",849.9f);
    		createPerson("Tony", "1995-11-11",3150);
    		createPerson("David", "2000-11-11",1409.8f);
    		createPerson("Sabine", "2005-11-11",2409.8f);
        }
 
    }

	private void createPerson(String fullName, String date,float salary) throws ParseException {
		Person p2 = new Person();
		p2.setFullName(fullName);
		p2.setSalary(salary);
		Date d2 = df.parse(date);
		p2.setDateOfBirth(d2);
		personDAO.save(p2);
	}

     
}