package com.bmc.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bmc.chatbot.database.CheckDb;

@SpringBootApplication
public class ChatbotOrchestratorApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(ChatbotOrchestratorApplication.class, args);
	    CheckDb obj = new CheckDb();
	    obj.Connectivity();
	    
		
	}

}
