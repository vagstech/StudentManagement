package com.student.studentmanagement.model;

import java.io.Serializable;
import java.util.Objects;

public class StudentModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4552272649625054514L;
	private String firstName;
	private String lastName;
	private Integer age;
	private String dob;
	private String email;
	private String pwd;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		StudentModel student = (StudentModel) o;
		return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName)
				&& Objects.equals(age, student.age) && Objects.equals(dob, student.dob)
				&& Objects.equals(email, student.email) && Objects.equals(pwd, student.pwd);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, age, dob, email, pwd);
	}
}
