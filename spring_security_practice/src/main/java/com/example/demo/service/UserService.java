package com.example.demo.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {

	List<User> users = 	new ArrayList<>();
	
	public UserService()
	{
		users.add(new User("asdf","asdf","asdf@gmail.com"));
		users.add(new User("aaa","aaa","aaa@gmail.com"));
	}
	
	public List<User> getAllUsers()
	{
		return users;
	}
	
	public User getUser(String username)
	{
		return users.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	public User addUser(User user)
	{
		users.add(user);
		return user;
	}
	
}
