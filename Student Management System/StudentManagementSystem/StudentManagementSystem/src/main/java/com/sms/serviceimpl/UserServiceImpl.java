package com.sms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sms.entities.User;


import com.sms.repository.UserRepository;

import com.sms.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User updateUserById(int id, User user) {
		User u=userRepository.findById(id).get();
		u.setUserName(user.getUserName());
		u.setPassword(user.getPassword());
		return userRepository.save(u);
	
	}

	@Override
	public User getUserById(int id) {
	
		return userRepository.findById(id).get();
	}

	@Override
	public void deleteUserById(int id) {

		
		 userRepository.deleteById(id);;
	
	}

}
