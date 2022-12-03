package com.minbo.dubbo.provider.service.impl;

import com.minbo.dubbo.provider.service.inf.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Welcome to Minbo's Dubbo, Hello  hhahahhahahhahhaha" + name;
	}

}
