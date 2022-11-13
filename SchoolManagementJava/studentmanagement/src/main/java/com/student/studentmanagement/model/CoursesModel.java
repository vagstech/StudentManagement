package com.student.studentmanagement.model;

import java.io.Serializable;
import java.util.Objects;

public class CoursesModel implements Serializable {

   
	private static final long serialVersionUID = -8594050626279284454L;
	private Integer courceId;
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
        CoursesModel cources = (CoursesModel) o;
        return Objects.equals(courceId, cources.courceId) && Objects.equals(courceName, cources.courceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courceId, courceName);
    }
}
