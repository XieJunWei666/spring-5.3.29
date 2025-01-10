package com.whoiszxl.defaultAnnotation;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Scope("singleton")
@Description("this is desc.")
@Lazy(value = false)
public class Boss implements ApplicationContextAware {

	private String name = "whoiszxl";

	private ApplicationContext applicationContext;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Boss{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public String getBeanName(Class clazz){
		return applicationContext.getBean(clazz).getClass().getName();
	}
}
