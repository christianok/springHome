package com.minbo.dubbo.consumer.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试用的 Controller 类；
 */
@Controller
public class TestController {

	/**
	 * 测试 JSON 接口；
	 * @return
	 */
	@ResponseBody

	@RequestMapping("/test/pulsar/{message}")
	public void testPulsar(@PathVariable("message") String message) {
		System.out.println(message);
	}

	@ResponseBody
	@RequestMapping("/test/pulsar/deliver/{message}")
	public void testPulsarDeliver(@PathVariable("message") String message) {
//		PaymentMessage paymentMessage = new PaymentMessage();
//		paymentMessage.setMessage(message);
		//producer.deliver("payment-topic", paymentMessage, );
	}
}