package com.practicajwt.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

	@GetMapping("hello")
	public String hello() {
		return "hola";
	}
	
}
