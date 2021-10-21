package com.shad.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HomeController {
	
	@GetMapping("/hello")
	public String getIndexPage() {
		
		return "index";
	}

}
