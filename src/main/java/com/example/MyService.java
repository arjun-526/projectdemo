package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@GetMapping("/Hello")
	public String hello()
	{
		return "Hello";
	}
	
}
