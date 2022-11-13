package com.student.studentmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.entity.Teacher;
import com.student.studentmanagement.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	TeacherRepository teacherRepository;
	
	public void createTeacher(Teacher teacherEntity) {
		teacherRepository.save(teacherEntity);
		
	}

	public List<Teacher> findAllTeachers(){
		return teacherRepository.findAll();
	}
	
	public Optional<Teacher> findById(Integer id) {
		return teacherRepository.findById(id);
	}
}
