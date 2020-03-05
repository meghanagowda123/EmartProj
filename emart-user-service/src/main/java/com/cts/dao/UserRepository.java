package com.cts.dao;

import org.springframework.data.repository.CrudRepository;
import com.cts.beans.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	User findByUsername(String username);
	
}