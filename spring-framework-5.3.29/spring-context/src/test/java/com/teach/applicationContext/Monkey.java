package com.teach.applicationContext;

import org.springframework.context.SmartLifecycle;

public class Monkey implements SmartLifecycle {

	private String name;

	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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
				", age='" + age + '\'' +
				'}';
	}

	@Override
	public void start() {
		System.out.println("lifecycle start");
	}

	@Override
	public void stop() {
		System.out.println("lifecycle stop");
	}

	@Override
	public boolean isRunning() {
		System.out.println("lifecycle isRunning");
		return false;
	}
}
