package com.teach.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RegisterListener {

	@EventListener
	public void handleUserRegisterEvent(UserEvent event) {
		// 处理用户注册事件
		System.out.println("accept welcome email to: " + event.getUsername());
	}
}
