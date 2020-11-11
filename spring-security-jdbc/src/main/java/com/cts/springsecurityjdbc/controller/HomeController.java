package com.cts.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String home() {
		return "<h2>Welcome to Spring Security</h2>";
	}

	@GetMapping("/user")
	public String user() {
		return "<h2>Welcome User</h2>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h2>Welcome Admin</h2>";
	}
}
