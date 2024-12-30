package com.whoiszxl.defaultAnnotation;

import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

	public void submitOrder() {
		System.out.println("OrderController 提交订单");
	}
}
