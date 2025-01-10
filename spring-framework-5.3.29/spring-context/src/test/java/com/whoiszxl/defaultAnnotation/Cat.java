package com.whoiszxl.defaultAnnotation;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


@Component
@Conditional(value = KrCondtion.class)
public class Cat {
	private String name = "cat";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
