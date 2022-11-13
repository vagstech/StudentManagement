package com.student.studentmanagement.model;


import java.io.Serializable;
import java.util.Objects;


public class MessagesModel implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4596302016153021042L;
	private Integer senderId;
    private  Integer receiverId;
    private String message;
    private Character flag;


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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessagesModel messages = (MessagesModel) o;
        return Objects.equals(senderId, messages.senderId) && Objects.equals(receiverId, messages.receiverId) && Objects.equals(message, messages.message) && Objects.equals(flag, messages.flag) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderId, receiverId, message, flag);
    }
}
