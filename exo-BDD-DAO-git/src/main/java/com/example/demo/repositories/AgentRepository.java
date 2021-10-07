package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Agent;

@Repository
public interface AgentRepository extends CrudRepository<Agent, String> {
	
}