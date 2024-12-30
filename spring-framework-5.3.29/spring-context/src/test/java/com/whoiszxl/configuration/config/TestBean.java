package com.whoiszxl.configuration.config;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

	private String name = "whoiszxl";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello() {
		System.out.println("hello");
	}

}
