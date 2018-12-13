package com.BootExample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@RequestMapping(value="home")
	public String home() {
		log.debug("home 호출");
		return "home";		
	}
	

}
