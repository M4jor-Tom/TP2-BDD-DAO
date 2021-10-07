package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Agent;

@Repository
public interface AgentRepository extends CrudRepository<Agent, String> {
	List<Agent> findByCommissionGreaterThan(Float commission);
	
	/*@Query(
		"SELECT a.agentCode FROM AGENTS a INNER JOIN CUSTOMER c ON c.agentCode = a.agentCode WHERE c.workingArea = :workingArea"
	)
	List<Agent> findByWorkingArea(String workingArea);*/
}

/*
SELECT a.AGENT_CODE
FROM AGENTS a
INNER JOIN CUSTOMER c
ON c.AGENT_AGENT_CODE = a.AGENT_CODE
WHERE c.WORKING_AREA = ''
*/