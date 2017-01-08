package com.test;

public class UploadException extends RuntimeException{
	private String message;
	
public UploadException(String message) {
		super(message);
		this.message = message;
	}

public UploadException() {
	// TODO Auto-generated constructor stub
}
}
