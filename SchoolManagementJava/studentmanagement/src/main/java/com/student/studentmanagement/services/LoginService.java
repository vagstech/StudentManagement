package com.student.studentmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.entity.Principal;
import com.student.studentmanagement.entity.Student;
import com.student.studentmanagement.entity.Teacher;
import com.student.studentmanagement.repository.PrincipalRepository;
import com.student.studentmanagement.repository.StudentRepository;
import com.student.studentmanagement.repository.TeacherRepository;

@Service
public class LoginService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	PrincipalRepository principalRepository;

	public boolean studentLogin(String username, String password) {
		Student findByEmailAndPwd = studentRepository.findByEmailAndPwd(username,password);
		if(null!=findByEmailAndPwd && findByEmailAndPwd.getEmail().equals(username) && findByEmailAndPwd.getPwd().equals(password)) {
			return true;
		}
		return false;
	}

	public boolean teacherLogin(String username, String password) {
		Teacher  teacher = teacherRepository.findByEmailAndPwd(username,password);
		if(null!=teacher && teacher.getEmail().equals(username) && teacher.getPwd().equals(password)) {
			return true;
		}
		return false;
	}

	public boolean principalLogin(String username, String password) {
		Principal findByEmailAndPwd = principalRepository.findByEmailAndPwd(username,password);
		if(null!=findByEmailAndPwd && findByEmailAndPwd.getEmail().equals(username) && findByEmailAndPwd.getPwd().equals(password)) {
			return true;
		}
		return false;
	}

}
