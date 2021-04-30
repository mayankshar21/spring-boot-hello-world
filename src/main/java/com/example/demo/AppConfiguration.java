package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to our web app. It is currently under construction!";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "Test Successful!";
	}
	
	@RequestMapping("/anothertest")
	public String anotherTest() {
		return "Test Worked again!";
	}
}
