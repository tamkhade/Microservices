package com.microservice.application.controller;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.microservice.application.services.UserService;
import com.microservice.application.user.User;

@RestController

public class UserController {
	
	@Autowired
	UserService userService;	
	
	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User user)
	{
        User userData = userService.saveUserData(user);	
        URI location = ServletUriComponentsBuilder
        		      .fromCurrentRequest().path("/{id}").buildAndExpand(userData.getId()).toUri();
        return ResponseEntity.created(location).build();
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
	//HATEOAS 
		
		
		//Resource<User>  resource = new Resource<User>
		return userService.getData(id);
		
	}
	
}
