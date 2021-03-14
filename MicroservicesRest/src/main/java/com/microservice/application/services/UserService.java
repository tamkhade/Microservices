package com.microservice.application.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.application.user.User;

@Service
public class UserService {

	List<User> liUser = new ArrayList<>();
	
	public void saveUserData(User user)
	{
		
		liUser.add(user);
	}
	
	public List<User> ListOfUser()
	{
		return liUser;
	}

	public User getData(int id) {
		// TODO Auto-generated method stub
		if(liUser.contains(id))
		{
			User user =	liUser.get(id);
			return user;
		}else
		{
			throw new UserNotFountException("Internal Server Error");
		}
	}
	
}
