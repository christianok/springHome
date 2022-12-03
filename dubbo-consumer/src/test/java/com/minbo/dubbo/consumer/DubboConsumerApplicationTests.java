package com.minbo.dubbo.consumer;

import com.sun.scenario.animation.shared.PulseReceiver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class DubboConsumerApplicationTests {
	@Autowired
	PulseReceiver pulseReceiver;

	@Test
	public void contextLoads() {
	}

	@Test
	public void  testHello(){
		String hello = "hello";
		System.out.println(hello);
		assert "hello".equals(hello);
	}
}
