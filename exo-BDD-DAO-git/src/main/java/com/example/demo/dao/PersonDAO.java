package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Person;
 
@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
    public List<Person> findAll();
	
    public Optional<Person> findById(@Param("id") Long id);
	
    public List<Person> findByFullNameLike(String name);
 
    public List<Person> findBySalaryGreaterThan(Float f);
 
    public List<Person> findByIdGreaterThan(Long id);

	public List<Person> findByFullNameStartingWith(String string);
}