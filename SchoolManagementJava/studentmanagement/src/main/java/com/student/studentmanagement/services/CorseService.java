package com.student.studentmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.entity.Courses;
import com.student.studentmanagement.repository.CoursesRepository;

@Service
public class CorseService {

	@Autowired
	CoursesRepository coursesRepository;
	
	
	public void createCourse(String course) {
		Courses courses = new Courses();
		courses.setCourceName(course);
		coursesRepository.save(courses);
	}
	
	public List<Courses> findCourses(){
		return coursesRepository.findAll();
	}
}
