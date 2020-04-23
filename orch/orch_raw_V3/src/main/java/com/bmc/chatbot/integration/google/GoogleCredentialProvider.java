package com.bmc.chatbot.integration.google;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

@Component
public class GoogleCredentialProvider {

    private String projectId;

    @Value("classpath:google-credential.json")
    private Resource credentialFile;

    private GoogleCredentials createGoogleCredentialFromFile() throws IOException {
        File file = credentialFile.getFile();
        FileInputStream stream = new FileInputStream(file);
        JsonElement credentialElement = JsonParser.parseReader(new InputStreamReader(stream));
        JsonObject credentialObj = credentialElement.getAsJsonObject();
        JsonPrimitive projectIdJsonObj = credentialObj.getAsJsonPrimitive("project_id");
        projectId = projectIdJsonObj.getAsString();
        System.out.print(projectId);
        GoogleCredentials googleCredentials = GoogleCredentials
            .fromStream(new FileInputStream(file));
        return googleCredentials;
    }

    public CredentialsProvider getCredential() throws IOException {
        return FixedCredentialsProvider.create(createGoogleCredentialFromFile());
    }

    public String getProjectId() {
        return projectId;
    }

}
