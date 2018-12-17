package com.demo.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolloController {

	@RequestMapping("/")
	public String hello() {
		return "Hello World！！！";
	}
}
