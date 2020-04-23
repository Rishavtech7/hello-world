package com.bmc.chatbot.integration.google;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

import com.bmc.chatbot.dto.RequestMessage;
import com.bmc.chatbot.dto.ResponseMessage;
import com.bmc.chatbot.exceptions.OrchestratorException;
import com.bmc.chatbot.integration.ConversationFacade;
import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.cloud.dialogflow.v2.QueryInput;
import com.google.cloud.dialogflow.v2.QueryResult;
import com.google.cloud.dialogflow.v2.SessionName;
import com.google.cloud.dialogflow.v2.SessionsClient;
import com.google.cloud.dialogflow.v2.SessionsSettings;
import com.google.cloud.dialogflow.v2.TextInput;
import com.google.cloud.dialogflow.v2.TextInput.Builder;

@Service
@Configuration
@PropertySources(value = { @PropertySource(value = "classpath:application.properties") })
public class DialogflowConversationFacadeImpl implements ConversationFacade {

    @Value("${google.dialogflow.languagecode}")
    private String languageCode;
    @Autowired
    private GoogleCredentialProvider googleCredentialProvider;


    @Override
    public ResponseMessage sendMessage(RequestMessage message) throws OrchestratorException {
        DetectIntentResponse response = null;
        String sessionId = message.getConversationSessionId();
        SessionsSettings sessionsSettings;
        try {
            sessionsSettings = SessionsSettings.newBuilder()
                .setCredentialsProvider(googleCredentialProvider.getCredential())
                .build();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            throw new OrchestratorException(ioe);
        }
        
        // Instantiates a client
        try (SessionsClient sessionsClient = SessionsClient.create(sessionsSettings)) {
            // Set the session name using the sessionId (UUID) and projectID (my-project-id)
            SessionName session = SessionName.of(googleCredentialProvider.getProjectId(), sessionId);
            System.out.println("Session Path: " + session.toString());

            String text = message.getText();
            // Set the text (hello) and language code (en-US) for the query
            Builder textInput = TextInput.newBuilder().setText(text).setLanguageCode(languageCode);

            // Build the query with the TextInput
            QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();

            // Performs the detect intent request
            response = sessionsClient.detectIntent(session, queryInput);
            System.out.println(response);


        } catch (Exception e) {
            throw new OrchestratorException(e);
        }
        return ResponseMessage.build(response);
    }

}
