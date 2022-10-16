package com.helloWorld.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class ThymleafController {
	@GetMapping
	String hello(Model model) 
	{
		model.addAttribute("msg", "Welcome to spring boot world.");
		return "HelloWorld";
	}
}
