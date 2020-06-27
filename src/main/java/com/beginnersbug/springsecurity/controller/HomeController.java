package com.beginnersbug.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("hello")
	public String getHello() {
		return "Hello";
	}

	@GetMapping("hi")
	public String getHi() {
		return "Hi";
	}

}
