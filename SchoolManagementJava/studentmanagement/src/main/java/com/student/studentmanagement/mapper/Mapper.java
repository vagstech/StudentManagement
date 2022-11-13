package com.student.studentmanagement.mapper;

import org.springframework.stereotype.Component;

import com.student.studentmanagement.entity.Messages;
import com.student.studentmanagement.entity.Principal;
import com.student.studentmanagement.entity.Student;
import com.student.studentmanagement.entity.Teacher;
import com.student.studentmanagement.model.MessagesModel;
import com.student.studentmanagement.model.PrincipalModel;
import com.student.studentmanagement.model.StudentModel;
import com.student.studentmanagement.model.TeacherModel;

@Component
public class Mapper {

    public Student mapStudent(StudentModel student){
       return new Student(student.getFirstName(),student.getLastName(),student.getAge(),student.getDob(),student.getEmail(),student.getPwd());
    }

    public Teacher mapTeacher(TeacherModel teacher) {
    	return new Teacher(teacher.getFirstName(),teacher.getLastName(),teacher.getAge(),teacher.getDob(),teacher.getEmail(),teacher.getPwd());
    }
    
    public Principal mapPrincipal(PrincipalModel principal) {
    	return new Principal(principal.getFirstName(),principal.getLastName(),principal.getAge(),principal.getDob(),principal.getEmail(),principal.getPwd());
    }
    
    public Messages mapMessage(MessagesModel message) {
    	return new Messages(message.getSenderId(),message.getReceiverId(),message.getMessage(),message.getFlag(),null);
    	
    }
}
