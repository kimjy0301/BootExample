package com.BootExample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {
	@RequestMapping("/hello")
	public String hello() {


		log.debug("Debug Test");
		log.debug("Debug Test");
		log.debug("Debug Test");
		log.debug("Debug Test");
		log.debug("Debug Test");
		
		return "hello";
	}
	
	
	@RequestMapping("/baseLayout")
	public String baseLayout() {
		return "baseLayout";
	}
	
	@RequestMapping("/content")
	public String content() {
		return "content";
	}
	
}
