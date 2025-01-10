package com.teach.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import java.util.Arrays;

public class SpringEventTest {

	private RegisterPublisher registerPublisher;

	@Test
	public void eventTest() {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext("com.teach.event");
//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		Arrays.stream(beanDefinitionNames).forEach(System.out::println);
		registerPublisher = (RegisterPublisher) context.getBean("registerPublisher");
		registerPublisher.publishEvent("jack");
	}
}
