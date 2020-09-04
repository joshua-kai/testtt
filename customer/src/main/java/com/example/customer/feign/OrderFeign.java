package com.example.customer.feign;

import com.example.customer.feign.impl.OrderFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order",fallback = OrderFeignImpl.class)
public interface OrderFeign {
	@RequestMapping("/order/get-order")
	String getOrderInfo();
}
