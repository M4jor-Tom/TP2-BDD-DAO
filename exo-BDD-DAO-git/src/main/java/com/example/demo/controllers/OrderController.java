package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.repositories.OrderRepository;

@RestController
public class OrderController {
	private OrderRepository orderRepository;
	
	private OrderRepository getOrderRepository() {
		return orderRepository;
	}

	@Autowired
	private void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@GetMapping("/order")
	public Order requestOrder(
			@RequestParam(name = "method", required = true, defaultValue = "id") String method,
			@RequestParam(name = "value", required = true) String value
	)
	{System.out.println(method + " " + value);
		switch(method) {
			case "id": {
				Optional<Order> orderOptional = getOrderRepository().findById(Integer.valueOf(value));
				if(orderOptional.isPresent()) {
					System.out.println(orderOptional.get().getOrdDescription());
				}
				else {
					System.out.println("id " + value + " referes to nothing");
				}
				return orderOptional.orElse(new Order());
			}
		}
		System.out.println("Unsuccessful query");
		return new Order();
	}
}