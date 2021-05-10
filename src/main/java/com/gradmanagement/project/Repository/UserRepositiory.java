package com.gradmanagement.project.Repository;

import org.springframework.data.repository.CrudRepository;

import com.gradmanagement.project.model.User;

public interface UserRepositiory extends CrudRepository<User, Long>{
	User findByUsername(String username);
}
