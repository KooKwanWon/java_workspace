package com.kakaotalk.model;

public class Message {

	private String messageIndex;
	private String messagenote;

	public Message() {
	}

	public Message(String messageIndex, String messagenote) {
		this.messageIndex = messageIndex;
		this.messagenote = messagenote;
	}

	public String getMessageIndex() {
		return messageIndex;
	}

	public void setMessageIndex(String messageIndex) {
		this.messageIndex = messageIndex;
	}

	public String getMessagenote() {
		return messagenote;
	}

	public void setMessagenote(String messagenote) {
		this.messagenote = messagenote;
	}
	
	
}
	
