package com.student.studentmanagement.model;

import java.io.Serializable;
import java.util.Objects;

public class StudentCoursesEnrolled implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2344864068035232055L;

	private Integer studentId;

	private Integer courseId;

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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		StudentCoursesEnrolled that = (StudentCoursesEnrolled) o;
		return Objects.equals(studentId, that.studentId) && Objects.equals(courseId, that.courseId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId, courseId);
	}
}
