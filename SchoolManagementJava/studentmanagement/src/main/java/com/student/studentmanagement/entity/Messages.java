package com.student.studentmanagement.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="messages")
public class Messages implements Serializable {

   
	private static final long serialVersionUID = 4861483569457118471L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="M_ID")
    private Integer messageId;

    @Column(name="S_ID")
    private Integer senderId;

    @Column(name="R_ID")
    private  Integer receiverId;

    @Column(name ="MESSAGE")
    private String message;

    @Column(name="FLAG")
    private Character flag;

    @Column(name="R_DATE")
    private String receivedDate;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Character getFlag() {
        return flag;
    }

    public void setFlag(Character flag) {
        this.flag = flag;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Messages messages = (Messages) o;
        return Objects.equals(messageId, messages.messageId) && Objects.equals(senderId, messages.senderId) && Objects.equals(receiverId, messages.receiverId) && Objects.equals(message, messages.message) && Objects.equals(flag, messages.flag) && Objects.equals(receivedDate, messages.receivedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, senderId, receiverId, message, flag, receivedDate);
    }

	public Messages(Integer senderId, Integer receiverId, String message, Character flag, String receivedDate) {
		super();
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.message = message;
		this.flag = flag;
		this.receivedDate = receivedDate;
	}

	public Messages() {
		super();
	}
    
    
}
