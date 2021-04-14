package com.dell.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String index() {
		return "This is running on HTTPS under SSL";
	}
}
