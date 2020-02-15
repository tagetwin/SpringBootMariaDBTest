package com.yndg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yndg.springboot.model.User;
import com.yndg.springboot.repository.UserRep;

@Service
public class UserService{

	@Autowired
	UserRep ur;
	
	public List<User> findAll() {

		List<User> users = ur.findAll();
		
		return users;
	}

}
