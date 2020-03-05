package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.beans.Registration;
import com.cts.dao.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository repo;

	public List<Registration> getAllRegistrations() {
		return (List<Registration>)repo.findAll();		
	}

	public void addRegistration(Registration registration) {
		repo.save(registration);		
	}

	public void updateRegistration(Registration registration) {
		repo.save(registration);
		
	}

	public void deleteRegistration(int id) {
		repo.deleteById(id);
		
	}

	public Registration findByUsername(String username) {
		return repo.findByUsername(username);
	}
	
	public Optional<Registration> getRegistrationDetailsById(int id) {
		return repo.findById(id);
	}

	public Registration findByRegistrationname(String username) {
		return repo.findByUsername(username);
	}

}














