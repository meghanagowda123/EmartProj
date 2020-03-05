package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.beans.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
    Registration findByUsername(String username);
}