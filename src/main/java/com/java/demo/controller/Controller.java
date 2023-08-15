package com.java.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/getdetail")
	public String getDetail() {
		return "webcome :::";
	}
	
	
	@GetMapping("/getemployee")
	public String getEmployee() {
		return "getEmployee :::";
	}
}
