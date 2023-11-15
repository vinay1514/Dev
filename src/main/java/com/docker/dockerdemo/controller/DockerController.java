package com.docker.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/name")
	public String getMyName() {
		
		return "This is a Simple Spring Boot Application";
	}
}
