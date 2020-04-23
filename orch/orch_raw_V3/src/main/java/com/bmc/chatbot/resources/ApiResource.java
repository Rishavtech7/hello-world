package com.bmc.chatbot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bmc.chatbot.entity.Feedback;
import com.bmc.chatbot.entity.UserMessage;
import com.bmc.chatbot.database.CheckDb;
import com.bmc.chatbot.exceptions.OrchestratorException;

@RestController
@RequestMapping("testapi")
public class ApiResource {

    @Autowired
    ConversationService conversationService;
    @Autowired
    Feedback sentimentAnalysis;

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome() {

        return "Welcome";
    }
    @RequestMapping(value = "message", method = RequestMethod.POST)
    
    public UserMessage message(UserMessage userMessage) {
        
        

        return conversationService.sendMessage(userMessage);
 
    }
    @RequestMapping(value = "feedback", method = RequestMethod.POST)
    public Feedback userFeedback (Feedback userFeedback) {

        return userFeedback;
        //send it to db;
    }
}
