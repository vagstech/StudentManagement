package com.student.studentmanagement.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentmanagement.entity.Principal;
import com.student.studentmanagement.mapper.Mapper;
import com.student.studentmanagement.model.PrincipalModel;
import com.student.studentmanagement.services.PrincipalService;

@RestController
@RequestMapping("/principal")
public class PrincipalController {

	@Autowired
	private Mapper mapper;

	@Autowired
	PrincipalService principalService;

	@PostMapping("/create")
	public void createPrincipal(@RequestBody() PrincipalModel principal) {
		Principal principalEntity = mapper.mapPrincipal(principal);
		principalService.createPrincipal(principalEntity);
	}

	@GetMapping("/getAllPrincipal")
	public List<Principal> getAll() {
		return principalService.getAllPrincipal();
	}

	@GetMapping("/getPrincipal/{id}")
	public Principal getPrincipalById(@PathVariable("id") Integer id) {
		Optional<Principal> principalById = principalService.getPrincipalById(id);
		if (!principalById.isEmpty()) {
			return principalById.get();
		}
		return null;
	}
	
	

}
