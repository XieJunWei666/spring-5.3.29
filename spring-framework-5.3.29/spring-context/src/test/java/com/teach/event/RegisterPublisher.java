package com.teach.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterPublisher {

	@Resource
	private ApplicationEventPublisher eventPublisher;

	public void publishEvent(String username) {
		UserEvent userEvent = new UserEvent(username, this);
		System.out.println("send email to " + username);
		eventPublisher.publishEvent(userEvent);
	}
}
