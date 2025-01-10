package com.whoiszxl.defaultAnnotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import javax.annotation.Resource;
import java.util.Arrays;

public class RunTest {

	private Boss boss;

	@Test
	public void testComponent() {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext("com.whoiszxl.defaultAnnotation");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		Arrays.stream(beanDefinitionNames).forEach(System.out::println);
	}
}
