package com.gradmanagement.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gradmanagement.project.Repository.UserRepositiory;

public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepositiory repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		return null;
	}
	
}
