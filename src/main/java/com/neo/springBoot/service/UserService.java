package com.neo.springBoot.service;

import java.util.List;

import com.neo.springBoot.entity.User;

public interface UserService {
	List<User> getUserList();

	User findUserById(long id);

	void save(User user);

	void edit(User user);

	void delete(long id);

}
