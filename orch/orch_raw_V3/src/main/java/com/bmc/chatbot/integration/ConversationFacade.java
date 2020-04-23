package com.bmc.chatbot.integration;

import com.bmc.chatbot.dto.RequestMessage;
import com.bmc.chatbot.dto.ResponseMessage;
import com.bmc.chatbot.exceptions.OrchestratorException;

public interface ConversationFacade {

	public ResponseMessage sendMessage(RequestMessage message) throws OrchestratorException;
	
}