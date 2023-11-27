package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entities.User;
import com.sms.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	ResponseEntity<User> createUser(@RequestBody User user)
	{
		return new ResponseEntity<User>(userService.createUser(user),
				HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllUsers")
	List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@PutMapping("/updateUser/{id}")
	ResponseEntity<User> updateUserById(@PathVariable("id") int id,@RequestBody User user)
	{
		return new ResponseEntity<User>(userService.updateUserById(id, user),HttpStatus.OK);
	}
	
	@GetMapping("/getUserById/{id}")
	ResponseEntity<User> getUserById(@PathVariable int id)
	{
		return new ResponseEntity<User>(userService.getUserById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	void deleteUserById(@PathVariable("id") int id) 
	{
		userService.deleteUserById(id);
	}
}
