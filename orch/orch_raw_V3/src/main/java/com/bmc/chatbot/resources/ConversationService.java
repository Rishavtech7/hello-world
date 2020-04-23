package com.bmc.chatbot.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bmc.chatbot.dto.RequestMessage;
import com.bmc.chatbot.dto.ResponseMessage;
import com.bmc.chatbot.entity.UserMessage;
import com.bmc.chatbot.exceptions.OrchestratorException;
import com.bmc.chatbot.integration.google.DialogflowConversationFacadeImpl;

@Component
public class ConversationService {
    private ResponseMessage response = new ResponseMessage();
    @Autowired
    DialogflowConversationFacadeImpl dialogflowConversationFacadeImpl;
    RequestMessage requestMessage = new RequestMessage();

    public UserMessage sendMessage(UserMessage userMessage) {
        requestMessage.setText(userMessage.getRequest());
        requestMessage.setConversationSessionId("123");
        try {
            response = dialogflowConversationFacadeImpl.sendMessage(requestMessage);
        } catch (OrchestratorException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String responseText = String.join("-", response.getText());
        userMessage.setResponse(responseText);
        return userMessage;

    }
}
