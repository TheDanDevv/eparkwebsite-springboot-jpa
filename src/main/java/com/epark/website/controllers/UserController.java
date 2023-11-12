package com.epark.website.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epark.website.entity.User;

@RestController
@RequestMapping(value ="/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User (1L, "Daniel", "daniel@gmail.com", "562.773.628-06","18 98364-9238","daniel123");
		return ResponseEntity.ok().body(u);
	}
}
