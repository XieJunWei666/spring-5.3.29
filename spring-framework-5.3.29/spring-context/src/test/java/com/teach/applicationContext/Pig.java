package com.teach.applicationContext;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class Pig implements EnvironmentAware {

	private Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Environment getEnvironment() {
		return environment;
	}

	@Override
	public String toString() {
		return "Pig{" +
				"environment=" + environment +
				'}';
	}
}
