package com.uwefuchs.demo.messages.serverapp.service;

import java.util.UUID;

import com.uwefuchs.demo.messages.serverapp.model.Message;

public interface MessageService {
	void createMessage(Message message);
	
	Message readMessage(UUID messageId);
	
	void updateMessage(Message message);
	
	void deleteMessage(UUID messageId);
}
