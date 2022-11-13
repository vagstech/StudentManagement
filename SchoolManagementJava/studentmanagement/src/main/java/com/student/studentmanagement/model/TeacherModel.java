package com.student.studentmanagement.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;


public class TeacherModel implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 5603734397817421268L;
	private String firstName;
    private String lastName;
    private Integer age;
    private Date dob;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherModel teacher = (TeacherModel) o;
        return  Objects.equals(firstName, teacher.firstName) && Objects.equals(lastName, teacher.lastName) && Objects.equals(age, teacher.age) && Objects.equals(dob, teacher.dob) && Objects.equals(email, teacher.email) && Objects.equals(pwd, teacher.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, dob, email, pwd);
    }
}
