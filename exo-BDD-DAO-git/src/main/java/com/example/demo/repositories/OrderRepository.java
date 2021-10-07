package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Agent;
import com.example.demo.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	List<Order> findByAgent(Agent agent);

	List<Order> findByOrdAmountGreaterThan(Float orderAmount);
}