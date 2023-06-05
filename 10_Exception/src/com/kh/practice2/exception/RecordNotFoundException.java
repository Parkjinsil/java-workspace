package com.kh.practice2.exception;

public class RecordNotFoundException extends Exception{

	public RecordNotFoundException() {
		this("This is REcordNotFoundException...");
	}
	
	public RecordNotFoundException(String message) {
		super(message);
	}
	
}
