package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	List<Order> findByAgentCode(String agentCode);

	List<Order> findByOrdAmountGreaterThan(Float orderAmount);
}