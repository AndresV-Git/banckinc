package com.bankInc.credibanco.ms.exceptions;

public class MessageNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public MessageNotFoundException(String message) {
		super(message);
	}

}
