package com.example.demo.model;

public class EmailRequest {

	private String to;
	private String subect;
	private String message;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubect() {
		return subect;
	}
	public void setSubect(String subect) {
		this.subect = subect;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public EmailRequest(String to, String subect, String message) {
		super();
		this.to = to;
		this.subect = subect;
		this.message = message;
	}
	@Override
	public String toString() {
		return "EmailRequest [to=" + to + ", subect=" + subect + ", message=" + message + "]";
	}
	
	
}