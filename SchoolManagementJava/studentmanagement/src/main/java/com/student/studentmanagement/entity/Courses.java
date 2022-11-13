package com.student.studentmanagement.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="Courses")
public class Courses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="C_ID")
    private Integer courceId;

    @Column(name = "C_NAME")
    private String courceName;

    public Integer getCourceId() {
        return courceId;
    }

    public void setCourceId(Integer courceId) {
        this.courceId = courceId;
    }

    public String getCourceName() {
        return courceName;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses cources = (Courses) o;
        return Objects.equals(courceId, cources.courceId) && Objects.equals(courceName, cources.courceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courceId, courceName);
    }
}
