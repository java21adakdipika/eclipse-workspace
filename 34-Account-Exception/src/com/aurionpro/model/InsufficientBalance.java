package com.aurionpro.model;

public class InsufficientBalance extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public InsufficientBalance(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.getClass().getSimpleName() + ": " + message;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + message;
	}
	
	

}
