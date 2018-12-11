package com.springboot.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	
	@GetMapping("/hello")
	public User hello() {
		
		User user = new User();
		
		user.setName("테스트");
		
		return user;
	}
}
