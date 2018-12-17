package com.demo.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springBoot.properties.DemoProperties;

@RestController
public class HolloController {

	@Autowired
	private DemoProperties demoProperties;

	@RequestMapping("/")
	public String hello() {
		System.out.println(demoProperties.getTitle());
		return "Hello World！！！";
	}
}
