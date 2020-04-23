package com.bmc.chatbot.exceptions;

public class OrchestratorException extends Exception {
	private static final long serialVersionUID = 1L;

	public OrchestratorException(String message) {
		super(message);
	}
	
	public OrchestratorException(Exception e) {
		super(e);
	}

}
