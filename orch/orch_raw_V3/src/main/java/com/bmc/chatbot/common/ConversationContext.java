package com.bmc.chatbot.common;

import java.util.HashMap;
import java.util.Map;

public class ConversationContext {

	private Map<String, Object> conversationContext = new HashMap<String, Object>();
	
	public void putObject(String key, Object object) {
		conversationContext.put(key, object);
	}
	
	public Object getObject(String key) {
		return conversationContext.get(key);
	}
}
