package com.bmc.chatbot.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
@PropertySources(value= {@PropertySource(value = "classpath:application.properties")})
public class ApplicationConfiguration {
	@Value("${google.language}")
	private String language;
	public String getLanguageCode()
	{
		return language;
	}
	
}
