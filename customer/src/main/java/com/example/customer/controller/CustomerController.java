package com.example.customer.controller;


import com.example.customer.feign.OrderFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:821316361@qq.com">lukai</a>
 * @version 2020/9/2
 */
@RestController
public class CustomerController {

	@Resource
	private OrderFeign orderFeign;

	@RequestMapping("get-customer")
	public String getCustomerString (){
		return "获取客户服务的信息";
	}
	@RequestMapping("get-order-info")
	//当调用微服务出现异常会降级到saveOrderFail方法中
	public String getOrderInfo (){
		//  使用openfeign 调用order服务
		String info =orderFeign.getOrderInfo();
		return info;
	}

}
