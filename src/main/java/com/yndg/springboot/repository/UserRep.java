package com.yndg.springboot.repository;

import java.util.List;

import com.yndg.springboot.model.User;

public interface UserRep {
	
	List<User> findAll();
	
	
}
