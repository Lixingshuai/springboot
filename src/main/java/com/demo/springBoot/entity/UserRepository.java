package com.demo.springBoot.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findById(long id);

	void deleteById(Long id);
}