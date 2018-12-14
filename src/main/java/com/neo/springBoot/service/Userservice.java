package com.neo.springBoot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.neo.springBoot.entity.User;

public interface Userservice {

	Page<User> loadUserPage(String params, Pageable pageable);

}
