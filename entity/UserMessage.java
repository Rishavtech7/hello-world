package com.bmc.chatbot.entity;

import java.util.HashMap;
import java.util.Map;

public class UserMessage {

    private String request;
    private String response;
    private Map<String, Object> context = new HashMap<String, Object>();
    

    public Map<String, Object> getContext() {
        return context;
    }

    public void setContext(Map<String, Object> context) {
        this.context = context;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
