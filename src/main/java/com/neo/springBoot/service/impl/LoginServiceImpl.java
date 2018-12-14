package com.neo.springBoot.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.neo.springBoot.service.LoginService;

//service层注解
@Service
//开启事务注解
@Transactional
public class LoginServiceImpl implements LoginService {

	@Override
	public String login() {
		return "success";
	}

}
