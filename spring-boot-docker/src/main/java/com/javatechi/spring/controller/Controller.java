package com.javatechi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/msg")
	public String getMessage() {
		return "welcome To ravi";
	}

}
