package com.neo.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.springBoot.service.LoginService;

//controller注解
@RestController
public class LoginController {

	@Autowired(required = true)
	private LoginService loginService;

	@RequestMapping("/login")
	public String login() {
		String result = loginService.login();
		if ("success".equals(result)) {
			return "true";
		} else {
			return "false";
		}
	}

}
