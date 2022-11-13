package com.student.studentmanagement.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name ="teacher_reg")
public class Teacher implements Serializable {

    @Id
    @Column(name="TEACHER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer teacherId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="AGE")
    private Integer age;

    @Column(name="DOB")
    private Date dob;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PWD")
    private String pwd;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

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
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacherId, teacher.teacherId) && Objects.equals(firstName, teacher.firstName) && Objects.equals(lastName, teacher.lastName) && Objects.equals(age, teacher.age) && Objects.equals(dob, teacher.dob) && Objects.equals(email, teacher.email) && Objects.equals(pwd, teacher.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, firstName, lastName, age, dob, email, pwd);
    }

	public Teacher(String firstName, String lastName, Integer age, Date dob, String email, String pwd) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.pwd = pwd;
	}

	public Teacher() {
		super();
	}
    
}
