package com.microservice.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.application.services.UserService;
import com.microservice.application.user.User;

@RestController

public class UserController {
	
	@Autowired
	UserService userService;	
	
	@PostMapping("/users")
	public void saveUser(@RequestBody User user)
	{
         userService.saveUserData(user);		
	}
	
	@PostMapping("/getusers")
	public List<User> getUserList()
	{
		List<User> li =userService.ListOfUser();
		return li;
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id)
	{
		  return userService.getData(id);
		
	}
	
}
