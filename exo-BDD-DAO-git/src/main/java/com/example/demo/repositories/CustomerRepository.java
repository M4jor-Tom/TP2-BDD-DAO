package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
	Optional<Customer> findByCustName(String custName);
	
	List<Customer> findByCustCity(String custCity);
	
	List<Customer> findByOpeningAtmGreaterThan(Float openingAtm);
}