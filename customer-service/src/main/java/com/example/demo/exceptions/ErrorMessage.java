package com.example.demo.exceptions;

public class ErrorMessage {
	
	private int code;
	private String message;
	private Long time;
	public ErrorMessage(int code, String message, Long time) {
		super();
		this.code = code;
		this.message = message;
		this.time = time;
	}
	public ErrorMessage() {
		super();
	}
	
	

}
