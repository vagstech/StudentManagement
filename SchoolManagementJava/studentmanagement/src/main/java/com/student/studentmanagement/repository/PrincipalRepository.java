package com.student.studentmanagement.repository;

import com.student.studentmanagement.entity.Principal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrincipalRepository extends JpaRepository<Principal,Integer> {

	Principal findByEmailAndPwd(String username, String password);
}
