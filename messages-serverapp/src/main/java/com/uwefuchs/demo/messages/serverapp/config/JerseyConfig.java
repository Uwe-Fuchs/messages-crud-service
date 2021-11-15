package com.uwefuchs.demo.messages.serverapp.config;

import java.util.Collections;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.uwefuchs.demo.messages.serverapp.resource.HelloResource;
import com.uwefuchs.demo.messages.serverapp.resource.MessagesResource;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(HelloResource.class);
		register(MessagesResource.class);
		setProperties(Collections.singletonMap(
				"jersey.config.server.response.setStatusOverSendError", true));
	}
}