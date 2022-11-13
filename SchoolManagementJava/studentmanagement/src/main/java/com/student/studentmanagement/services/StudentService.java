package com.student.studentmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.entity.Student;
import com.student.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    
    
    public List<Student> getAllStudents(){
    	return studentRepository.findAll();
    }
    
    public Optional<Student> getStudentById(Integer id) {
    	return studentRepository.findById(id);
    }

}
