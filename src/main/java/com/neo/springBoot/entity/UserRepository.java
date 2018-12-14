package com.neo.springBoot.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String userName);

	User findByUserNameOrEmail(String username, String email);

	Page<User> findByUserName(String params, Pageable pageable);

	Page<User> findAllByOrderByIdDesc(Pageable pageable);
}
