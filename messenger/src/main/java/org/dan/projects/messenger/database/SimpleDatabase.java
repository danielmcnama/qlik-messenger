package org.dan.projects.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.dan.projects.messenger.model.Message;
import org.dan.projects.messenger.model.Profile;

public class SimpleDatabase {
	
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
}
