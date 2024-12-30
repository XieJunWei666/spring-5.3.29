package com.teach.aware;

import org.junit.Test;
import org.springframework.lang.Nullable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanDefinitionTest {

	@Test
	public void testBeanDefinition() {

		Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
		beanDefinitionMap.put("pig", new BeanDefinition(Pig.class));
		beanDefinitionMap.put("fish", new BeanDefinition(Fish.class));
		beanDefinitionMap.put("memberService", new BeanDefinition(MemberService.class));
		beanDefinitionMap.put("orderService", new BeanDefinition(OrderService.class));

	}

	public class BeanDefinition {
		@Nullable
		private Object beanClass;

		private String scope;

		private Boolean lazyInit;

		public BeanDefinition(@Nullable Object beanClass) {
			this.beanClass = beanClass;
		}
	}



	public class Pig {
		private String name;
	}

	public class Fish {
		private String name;
	}

	public class MemberService {
		public void login() {
			System.out.println("登录");
		}
	}

	public class OrderService {
		public void submit() {
			System.out.println("提交订单");
		}
	}
}
