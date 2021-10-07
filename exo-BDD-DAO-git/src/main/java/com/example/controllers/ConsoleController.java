package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsoleController {
	@GetMapping("/console")
	public String console() {
		return "redirect:/h2-console";
	}
}