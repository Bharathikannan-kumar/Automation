package com.Automation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value="/Auto")
public class AutomationController {

	
	@GetMapping(value="/show")
	public String getview() {
		return "Hello World";
	}
}
