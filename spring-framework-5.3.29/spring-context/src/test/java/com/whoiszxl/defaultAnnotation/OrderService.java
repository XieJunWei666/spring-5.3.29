package com.whoiszxl.defaultAnnotation;

import org.springframework.stereotype.Service;

/**
 * 订单服务
 */
@Service
public class OrderService {

	public void submitOrder() {
		System.out.println("OrderService 提交订单");
	}
}
