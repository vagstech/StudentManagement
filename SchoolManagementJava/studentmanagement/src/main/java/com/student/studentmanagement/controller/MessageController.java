package com.student.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentmanagement.entity.Messages;
import com.student.studentmanagement.mapper.Mapper;
import com.student.studentmanagement.model.MessagesModel;
import com.student.studentmanagement.services.MessageServices;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	MessageServices messageServices;
	
	@Autowired
	Mapper mapper;
	
	@PostMapping("/create")
	public void createMessage(@RequestBody() MessagesModel messageModel) {
		Messages messages = mapper.mapMessage(messageModel);
		messageServices.createMessage(messages);
	}
	
	@GetMapping("/findAll")
	public List<Messages> findAll(){
		return messageServices.findMessages();
	}
	
	@GetMapping("/findBySender/{senderId}")
	public List<Messages> findBySenderId(@PathVariable("senderId") Integer senderId){
		return messageServices.findBySenderId(senderId);
	}
	
	@GetMapping("/findBySender/{receiverId}")
	public List<Messages> findByReceiverId(@PathVariable("receiverId") Integer receiverId){
		return messageServices.findByReceiverId(receiverId);
	}
}
