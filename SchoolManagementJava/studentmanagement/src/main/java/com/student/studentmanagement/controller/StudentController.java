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

import com.student.studentmanagement.entity.Student;
import com.student.studentmanagement.mapper.Mapper;
import com.student.studentmanagement.model.StudentModel;
import com.student.studentmanagement.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private Mapper mapper;

    @Autowired
    StudentService studentService;


    @PostMapping("/create")
    public Student createStudent(@RequestBody() StudentModel student){
       Student studentEntity = mapper.mapStudent(student);
        return studentService.createStudent(studentEntity);
    }
    
    @GetMapping("/getAllStudents")
	public List<Student> getAll() {
		return studentService.getAllStudents();
	}

	@GetMapping("/getStudent/{id}")
	public Student getPrincipalById(@PathVariable("id") Integer id) {
		Optional<Student> studentById = studentService.getStudentById(id);
		if (!studentById.isEmpty()) {
			return studentById.get();
		}
		return null;
	}
}
