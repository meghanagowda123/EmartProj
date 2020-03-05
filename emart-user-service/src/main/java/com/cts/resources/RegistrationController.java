package com.cts.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.beans.Registration;
import com.cts.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationService service;

	@RequestMapping("/registrations")
	List<Registration> getAllRegistrations() {
		return service.getAllRegistrations();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/registrations")
	void addRegistration(@RequestBody Registration registration) {
		service.addRegistration(registration);
	}
	
	@RequestMapping("/registrations/{id}")
	Optional<Registration> getRegistrationDetailsById(@PathVariable int id) {
		return service.getRegistrationDetailsById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/registrations/")
	void updateRegistration(@RequestBody Registration registration) {
		service.updateRegistration(registration);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/registrations/{id}")
	void deleteRegistration(@PathVariable int id) {
		service.deleteRegistration(id);
	}
	
	@RequestMapping("/registrations/username/{username}")
	Registration findByByRegistrationname(@PathVariable String username){
		return service.findByRegistrationname(username);
	}
	
}