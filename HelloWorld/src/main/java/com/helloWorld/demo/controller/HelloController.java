package com.helloWorld.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloWorld.demo.business.IHelloService;

@RestController
@RequestMapping("/helloWorld")
public class HelloController {
	
	IHelloService service;
	
	@Autowired
	public HelloController(IHelloService service) {
		this.service = service;
	}

	
	@GetMapping
	public String getMessage() {
		return service.getMessage();
	}
}
