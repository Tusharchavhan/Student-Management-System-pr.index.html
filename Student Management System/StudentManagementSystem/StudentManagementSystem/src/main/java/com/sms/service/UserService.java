package com.sms.service;

import java.util.List;


import com.sms.entities.User;


public interface UserService {
User createUser(User user);
List<User> getAllUsers();
User updateUserById(int id,User user);
User getUserById(int id);
void deleteUserById(int id);
}
