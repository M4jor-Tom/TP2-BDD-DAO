package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Agent;

@Repository
public interface AgentRepository extends CrudRepository<Agent, String> {
	List<Agent> findByCommissionGreaterThan(Float commission);
	
	@Query("SELECT a FROM Agent a JOIN Customer c ON c.agentCode = a.agentCode")
	List<Agent> findByWorkingArea(String workingArea);
}