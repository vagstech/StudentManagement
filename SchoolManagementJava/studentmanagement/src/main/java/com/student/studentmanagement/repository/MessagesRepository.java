package com.student.studentmanagement.repository;

import com.student.studentmanagement.entity.Messages;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages,Integer> {

	List<Messages> findBySenderId(Integer senderId);

	List<Messages> findByReceiverId(Integer receiverId);
}
