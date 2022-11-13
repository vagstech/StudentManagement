package com.student.studentmanagement.repository;

import com.student.studentmanagement.entity.StudentCoursesEnrolled;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCoursesEnrolledRepository extends JpaRepository<StudentCoursesEnrolled,Integer> {
}
