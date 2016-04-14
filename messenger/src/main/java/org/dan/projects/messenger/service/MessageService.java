package org.dan.projects.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dan.projects.messenger.database.SimpleDatabase;
import org.dan.projects.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = SimpleDatabase.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello Suzy", "Dan", "Suzy"));
		messages.put(2L, new Message(2, "Hello Dan", "Suzy", "Dan"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllSentMessagesForProfile(String profileName) {
		List<Message> sentList = new ArrayList<Message>();
		for(Message message : messages.values()) {
			if(message.getRecipient().equals(profileName)) {
				sentList.add(message);
			}
		}
		
		return sentList;
	}
	
	public List<Message> getAllReceivedMessagesForProfile(String profileName) {
		List<Message> receivedList = new ArrayList<Message>();
		for(Message message : messages.values()) {
			if(message.getRecipient().equals(profileName)) {
				receivedList.add(message);
			}
		}
		
		return receivedList;
	}
	
	public Message getMessage(long id) {
		Message message = messages.get(id);
		if(message == null) {
			// throw exception for data not found
		}
		return message;
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	
}
