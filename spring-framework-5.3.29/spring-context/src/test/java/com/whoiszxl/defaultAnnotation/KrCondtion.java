package com.whoiszxl.defaultAnnotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class KrCondtion implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String name = context.getEnvironment().getProperty("app.profiles.active");
		if (name != null) {
			return name.equalsIgnoreCase("cat");
		}
		return false;
	}
}
