package com.whoiszxl.defaultAnnotation;

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
public class Boss {

	private String name = "whoiszxl";

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
}
