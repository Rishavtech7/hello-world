package com.bmc.chatbot.dto;

import org.springframework.stereotype.Component;

import com.bmc.chatbot.common.ConversationContext;
@Component
public class RequestMessage {

	private String conversationSessionId;
	private String text;
	private ConversationContext conversationContext;
	/**
	 * @return the conversationId
	 */
	public String getConversationSessionId() {
		return conversationSessionId;
	}
	/**
	 * @param conversationId the conversationId to set
	 */
	public void setConversationSessionId(String conversationId) {
		this.conversationSessionId = conversationId;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the conversationContext
	 */
	public ConversationContext getConversationContext() {
		return conversationContext;
	}
	/**
	 * @param conversationContext the conversationContext to set
	 */
	public void setConversationContext(ConversationContext conversationContext) {
		this.conversationContext = conversationContext;
	}

}

