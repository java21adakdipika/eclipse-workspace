package com.aurionpro.exception;

public class InvalidAgeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	String message;

	public InvalidAgeException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.getClass().getSimpleName() + ": " + message;
	}
	
//	@Override
//	public String toString() {
//		return this.getClass().getSimpleName() + ": " + message;
//	}
}
