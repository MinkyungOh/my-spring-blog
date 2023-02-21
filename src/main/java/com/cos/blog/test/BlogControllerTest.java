package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	//http://localhost:8080/api/test/hello
	@GetMapping("/api/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
}
