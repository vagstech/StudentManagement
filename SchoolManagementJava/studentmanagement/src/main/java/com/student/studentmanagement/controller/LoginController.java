package com.student.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentmanagement.model.LoginModel;
import com.student.studentmanagement.services.LoginService;

@RestController
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public boolean login(@RequestBody LoginModel loginModel) {
		if(loginModel.getRole().equals("student")) {
			return loginService.studentLogin(loginModel.getUsername(), loginModel.getPassword());
		}else if(loginModel.getRole().equals("teacher")) {
			return loginService.teacherLogin(loginModel.getUsername(), loginModel.getPassword());
		}else
			return loginService.principalLogin(loginModel.getUsername(), loginModel.getPassword());
	}

}
