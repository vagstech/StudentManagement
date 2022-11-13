package com.student.studentmanagement.entity;

import javax.naming.Name;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "teacher_courses_enrolled")
public class TeachersCoursesEnrolled implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ENROLL_ID")
    private Integer enrollId;

    @Column(name = "TEACHER_ID")
    private Integer teacherId;

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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

}
