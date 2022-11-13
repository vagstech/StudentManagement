package com.student.studentmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.entity.Principal;
import com.student.studentmanagement.repository.PrincipalRepository;

@Service
public class PrincipalService {

	@Autowired
	PrincipalRepository principalRepository;

	public void createPrincipal(Principal principalEntity) {
		principalRepository.save(principalEntity);
	}

	public List<Principal> getAllPrincipal() {
		return principalRepository.findAll();
	}

	public Optional<Principal> getPrincipalById(Integer id) {
		return principalRepository.findById(id);
	}
	
	

}
