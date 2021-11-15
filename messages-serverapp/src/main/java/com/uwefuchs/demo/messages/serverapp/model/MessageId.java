package com.uwefuchs.demo.messages.serverapp.model;

import java.util.UUID;

public class MessageId {
	private final UUID messageId;
	
	public MessageId() {
		super();
		this.messageId = UUID.randomUUID();
	}

	public MessageId(UUID messageId) {
		this.messageId = messageId;
	}

	public UUID getMessageId() {
		return messageId;
	}
}
