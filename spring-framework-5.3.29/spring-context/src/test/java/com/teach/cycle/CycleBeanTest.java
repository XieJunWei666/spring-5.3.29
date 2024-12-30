package com.teach.cycle;

import com.teach.applicationContext.Pig;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleBeanTest {

	private static final String XML_FILE = "com/teach/cycle/cycle.xml";

	@Test
	public void testCycle() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(XML_FILE);
		CycleOne cycleOne = applicationContext.getBean("cycleOne", CycleOne.class);
		System.out.println("one 测试输出:" + cycleOne);
	}

}
