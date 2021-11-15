package com.uwefuchs.demo.messages.serverapp.model;

public class Message {
	private final MessageId messageId;
	private String title;
	private String text;
	
	public Message() {
		super();
		this.messageId = new MessageId();
	}
	
	public Message(String title) {
		this();
		this.title = title;
	}
	
	public Message(String title, String text) {
		this(title);
		this.text = text;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setText(String text) {
		this.text = text;
	}

	public MessageId getMessageId() {
		return messageId;
	}

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}	
}
