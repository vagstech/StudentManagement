package com.student.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentmanagement.entity.Courses;
import com.student.studentmanagement.services.CorseService;

@RestController
@RequestMapping("/courses")
public class CoursesController {
	
	@Autowired
	CorseService corseService;

	@GetMapping("/createcourse")
	public void createCourse(@PathVariable("course") String course) {
		corseService.createCourse(course);
	}
	
	@GetMapping("/findCourses")
	public List<Courses> findCourses(){
		return corseService.findCourses();
	}
}
