package com.student.studentmanagement.repository;

import com.student.studentmanagement.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses,Integer> {
}
