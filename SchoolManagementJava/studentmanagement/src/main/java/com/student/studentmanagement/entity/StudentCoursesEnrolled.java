package com.student.studentmanagement.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "student_courses_enrolled")
public class StudentCoursesEnrolled {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ENROLL_ID")
    private Integer enrollId;

    @Column(name = "STUDENT_ID")
    private Integer studentId;

    @Column(name = "COURSE_ID")
    private Integer courseId;


    @Column(name="CREATED_DATE")
    private Timestamp enrolledOn;

    public Integer getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Integer enrollId) {
        this.enrollId = enrollId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Timestamp getEnrolledOn() {
        return enrolledOn;
    }

    public void setEnrolledOn(Timestamp enrolledOn) {
        this.enrolledOn = enrolledOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCoursesEnrolled that = (StudentCoursesEnrolled) o;
        return Objects.equals(enrollId, that.enrollId) && Objects.equals(studentId, that.studentId) && Objects.equals(courseId, that.courseId) && Objects.equals(enrolledOn, that.enrolledOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollId, studentId, courseId, enrolledOn);
    }
}
