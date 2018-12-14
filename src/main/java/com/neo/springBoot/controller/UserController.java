package com.neo.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.springBoot.entity.User;
import com.neo.springBoot.service.Userservice;

@RestController
public class UserController {

	@Autowired
	private Userservice userService;

	@RequestMapping("/user/loadUserPage")
	private Page<User> loadUserPage(Pageable page, String params) {
		return userService.loadUserPage(params, page);
	}

}
