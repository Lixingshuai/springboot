package com.neo.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.springBoot.entity.User;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setUserName("小明");
		user.setPassWord("这是密码");
		return user;
	}
}
