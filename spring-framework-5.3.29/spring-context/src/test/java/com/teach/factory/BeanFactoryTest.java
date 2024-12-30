package com.teach.factory;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	private static final String XML_FILE = "com/teach/factory/beanFactory.xml";

	@Test
	public void testXmlBeanFactory() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(XML_FILE));
		Monkey monkey = (Monkey) beanFactory.getBean("monkey");
		System.out.println("beanFactory测试输出:" + monkey.getName());
	}
}
