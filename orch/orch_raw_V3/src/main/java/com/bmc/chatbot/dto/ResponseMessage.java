package com.bmc.chatbot.dto;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bmc.chatbot.common.ConversationContext;
import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.cloud.dialogflow.v2.QueryResult;
@Component
public class ResponseMessage {
	private String id;
	private String conversationSessionId;
	private List<String> text;
	private Float score;
	private Date createDate;
	private Date lastModified;
	
	private ConversationContext conversationContext;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the text
	 */
	public List<String> getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(List<String> text) {
		this.text = text;
	}
	/**
	 * @return the score
	 */
	public Float getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(Float score) {
		this.score = score;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}
	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
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
	
	/**
	 * @return the conversationSessionId
	 */
	public String getConversationSessionId() {
		return conversationSessionId;
	}
	
	/**
	 * @param conversationSessionId the conversation Session Id to set
	 */
	public void setConversationSessionId(String conversationSessionId) {
		this.conversationSessionId = conversationSessionId;
	}

	public static ResponseMessage build(DetectIntentResponse response) {
		ResponseMessage message = new ResponseMessage();
        QueryResult queryResult = response.getQueryResult();
		List<String> responseText = Arrays.asList(queryResult.getFulfillmentText());
		message.setText(responseText);
		return message;
	}
}
