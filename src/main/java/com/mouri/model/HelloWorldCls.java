package com.mouri.model;

public class HelloWorldCls {
	private String message;
	private String dateTime;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public HelloWorldCls(String message, String dateTime) {
		super();
		this.message = message;
		this.dateTime = dateTime;
	}
	public HelloWorldCls() {
		super();
	}
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + ", dateTime=" + dateTime + "]";
	}
	
	

}
