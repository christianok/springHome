package com.minbo.dubbo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Slf4j
@SpringBootApplication
// 使用 consumers.xml 配置；
public class DubboConsumerApplication {

	public static void main(String[] args) {
		Runtime.getRuntime().availableProcessors();
		SpringApplication.run(DubboConsumerApplication.class, args);
	}
}
