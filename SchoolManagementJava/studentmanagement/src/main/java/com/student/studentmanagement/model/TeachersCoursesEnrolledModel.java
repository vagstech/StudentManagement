package com.student.studentmanagement.model;

import java.io.Serializable;

public class TeachersCoursesEnrolledModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3923118165018106320L;
	private Integer teacherId;
	private Integer courseId;

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

}
