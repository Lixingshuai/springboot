package com.neo.springBoot.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.neo.springBoot.entity.User;
import com.neo.springBoot.entity.UserRepository;
import com.neo.springBoot.service.Userservice;

@Service
@Transactional
public class UserServiceImpl implements Userservice {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Page<User> loadUserPage(String params, Pageable pageable) {
		if (params != null && params.trim().length() > 0) {
			return userRepository.findByUserName(params, pageable);
		} else {
			return userRepository.findAllByOrderByIdDesc(pageable);
		}
	}

}
