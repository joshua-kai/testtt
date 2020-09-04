package com.example.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:821316361@qq.com">lukai</a>
 * @version 2020/9/2
 */
@RequestMapping("order")
@RestController
public class OrderController {

	@RequestMapping("get-order")
	public String getOrderString (){
		System.out.println("获取订单服务1的信息");
		return "获取订单服务的信息";
	}
}
