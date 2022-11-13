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

import com.student.studentmanagement.entity.Teacher;
import com.student.studentmanagement.mapper.Mapper;
import com.student.studentmanagement.model.TeacherModel;
import com.student.studentmanagement.services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private Mapper mapper;

    @Autowired
    TeacherService teacherService;


    @PostMapping("/create")
    public void createStudent(@RequestBody() TeacherModel teacher){
       Teacher teacherEntity = mapper.mapTeacher(teacher);
       teacherService.createTeacher(teacherEntity);
    }
    
    @GetMapping("/getAllTeachers")
   	public List<Teacher> getAll() {
   		return teacherService.findAllTeachers();
   	}

   	@GetMapping("/getTeacher/{id}")
   	public Teacher getPrincipalById(@PathVariable("id") Integer id) {
   		Optional<Teacher> teacherById = teacherService.findById(id);
   		if (!teacherById.isEmpty()) {
   			return teacherById.get();
   		}
   		return null;
   	}
}
