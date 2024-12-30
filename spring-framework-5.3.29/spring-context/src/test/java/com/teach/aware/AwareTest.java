package com.teach.aware;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AwareTest {

	private static final String XML_FILE = "com/teach/aware/beanFactory.xml";

	@Test
	public void testAwareDemo() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(XML_FILE));
		Monkey monkey = (Monkey) beanFactory.getBean("monkey");
		System.out.println("aware测试输出:" + monkey);
	}
}
