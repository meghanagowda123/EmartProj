package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.beans.User;
import com.cts.dao.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	public List<User> getAllUsers() {
		return (List<User>)repo.findAll();
		
	}

	public void addUser(User user) {
		repo.save(user);
		
	}

	public Optional<User> getUserDetailsByID(int id) {		
		return repo.findById(id);
	}

	public void updateUser(User user) {
		repo.save(user);
		
	}

	public void deleteUser(int id) {
		repo.deleteById(id);
		
	}

	public User getUserByUserName(String username) {
		return repo.findByUsername(username);
		
	}

}
