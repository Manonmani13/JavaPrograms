package com.proretention.user.response;

import org.springframework.stereotype.Component;


@Component
public class MessageResponse {
private int status;
private String message;
private EducationResponse content;
public MessageResponse(int status, String message, EducationResponse content) {
	super();
	this.status = status;
	this.message = message;
	this.content = content;
}
public MessageResponse() {
	super();
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public EducationResponse getContent() {
	return content;
}
public void setContent(EducationResponse content) {
	this.content = content;
}



}
