package com.teach.event;

import org.springframework.context.ApplicationEvent;

public class UserEvent extends ApplicationEvent {

	private String username;

	public UserEvent(String username, Object source) {
		super(source);
		this.username = username;

	}

	public String getUsername() {
		return username;
	}
}
