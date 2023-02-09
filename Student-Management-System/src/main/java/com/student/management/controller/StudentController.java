package com.student.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path="/")
public class StudentController {
	
	@GetMapping(path="/")
	public String showHomePage() {
		
		return "HomePage";
	}

}
