package com.helloWorld.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HelloManager implements IHelloService{

	IHelloService service;
	
	@Autowired
	public HelloManager() {
	}
	@Override
	public String getMessage() {
		return "Hello World";
	}
	
	
}
