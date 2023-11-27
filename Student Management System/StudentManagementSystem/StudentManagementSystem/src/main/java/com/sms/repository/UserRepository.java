package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	//User findByUserId(int id);
	//User findByUserNameAndPassword(String userName,String password);
}
