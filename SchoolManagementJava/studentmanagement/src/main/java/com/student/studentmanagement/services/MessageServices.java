package com.student.studentmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.entity.Messages;
import com.student.studentmanagement.repository.MessagesRepository;

@Service
public class MessageServices {

	@Autowired
	MessagesRepository messagesRepository;
	
	public void createMessage(Messages messages) {
		messagesRepository.save(messages);
	}
	
	public List<Messages> findMessages(){
		return messagesRepository.findAll();
	}

	public List<Messages> findBySenderId(Integer senderId) {
		return messagesRepository.findBySenderId(senderId);
	}

	public List<Messages> findByReceiverId(Integer receiverId) {
		return messagesRepository.findByReceiverId(receiverId);
	}
}
