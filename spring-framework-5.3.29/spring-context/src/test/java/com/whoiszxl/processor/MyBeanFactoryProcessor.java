package com.whoiszxl.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition monkey = beanFactory.getBeanDefinition("monkey");
		monkey.setDescription("this is monkey");
		System.out.println("BeanFactoryPostProcessor前开始执行：" + beanFactory.getBeanDefinitionNames());
	}
}
