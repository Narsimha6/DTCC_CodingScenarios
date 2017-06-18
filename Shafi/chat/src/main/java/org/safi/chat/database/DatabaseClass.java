package org.safi.chat.database;

import java.util.HashMap;
import java.util.Map;

import org.safi.chat.model.User;
import org.safi.chat.model.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, User> users = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<String, User> getUsers() {
		return users;
	}

}
