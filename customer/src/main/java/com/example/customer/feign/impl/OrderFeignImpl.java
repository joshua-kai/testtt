package com.example.customer.feign.impl;

import com.example.customer.feign.OrderFeign;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:821316361@qq.com">lukai</a>
 * @version 2020/9/3
 */
@Component
public class OrderFeignImpl implements OrderFeign {

	@Override
	public String getOrderInfo() {
		return "getOrder 降级方法";
	}
}
