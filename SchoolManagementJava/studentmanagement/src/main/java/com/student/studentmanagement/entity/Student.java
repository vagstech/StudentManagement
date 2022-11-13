package com.student.studentmanagement.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="STUDENT_REG")
public class Student implements Serializable {

    @Id
    @Column(name="S_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="AGE")
    private Integer age;

    @Column(name="DOB")
    private String dob;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PWD")
    private String pwd;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(age, student.age) && Objects.equals(dob, student.dob) && Objects.equals(email, student.email) && Objects.equals(pwd, student.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, age, dob, email, pwd);
    }

    public Student(String firstName, String lastName, Integer age, String dob, String email, String pwd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.pwd = pwd;
    }

    public Student() {

    }
}
