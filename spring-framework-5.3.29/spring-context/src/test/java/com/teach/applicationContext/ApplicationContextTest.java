package com.teach.applicationContext;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	private static final String XML_FILE = "com/teach/applicationContext/applicationContext.xml";

	@Test
	public void testClassPathXmlApplicationContext() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(XML_FILE);
//		Monkey monkey = applicationContext.getBean("monkey", Monkey.class);
//		System.out.println("ApplicationContext测试输出:" + monkey);
//		applicationContext.close();

		Pig pig = applicationContext.getBean("pig", Pig.class);
		System.out.println("ApplicationContext测试输出:" + pig);
		applicationContext.close();
	}

	@Test
	public void testAware() {
		System.getProperties().put("test", "hello");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(XML_FILE);
		Pig pig = applicationContext.getBean("pig", Pig.class);
		System.out.println("testAware测试输出:" + pig.getEnvironment().getProperty("test"));
	}
}
