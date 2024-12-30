package com.teach.applicationContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Monkey) {
			System.out.println("monkey postProcess Before Initialization:" + beanName);
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Monkey) {
			System.out.println("monkey postProcess After Initialization:" + beanName);
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
