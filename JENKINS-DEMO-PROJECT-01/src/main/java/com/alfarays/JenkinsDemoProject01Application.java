package com.alfarays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/messages")
public class JenkinsDemoProject01Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoProject01Application.class, args);
	}


	@GetMapping
	public ResponseEntity<?> welcome() {
		Map<String, String> map = new HashMap<>();
		map.put("message","Welcome to spring boot jenkins series.");
		return ResponseEntity.ok(map);
	}


}
