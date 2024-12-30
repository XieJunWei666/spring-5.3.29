package com.teach.aware;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Monkey implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware {

	private String name;

	private String beanName;

	private BeanFactory beanFactory;

	private ClassLoader classLoader;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(@NotNull String beanName) {
		this.beanName = beanName;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Monkey{" +
				"name='" + name + '\'' +
				", beanName='" + beanName + '\'' +
				", beanFactory=" + beanFactory +
				", classLoader=" + classLoader +
				'}';
	}
}
