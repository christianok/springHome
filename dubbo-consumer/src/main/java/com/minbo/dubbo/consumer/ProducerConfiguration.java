//package com.minbo.dubbo.consumer;
//
//import io.github.majusko.pulsar.producer.ProducerFactory;
//import org.apache.pulsar.client.api.ConsumerInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ProducerConfiguration {
//    @Bean
//    public ProducerFactory producerFactory() {
//        return new ProducerFactory()
//                // topic3 使用MyMessage类型生产者 (自定义消息类型)
//                .addProducer("payment-topic", String.class)
//                .addProducer("payment-topic", PaymentMessage.class);
//    }
//
//
//}