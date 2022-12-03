//package com.minbo.dubbo.consumer;
//
//import io.github.majusko.pulsar.PulsarMessage;
//import io.github.majusko.pulsar.producer.PulsarTemplate;
//import io.github.majusko.pulsar.utils.UrlBuildService;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.pulsar.client.api.MessageId;
//import org.apache.pulsar.client.api.Producer;
//import org.apache.pulsar.client.api.PulsarClient;
//import org.apache.pulsar.client.api.PulsarClientException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Import;
//import org.springframework.stereotype.Component;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.concurrent.TimeUnit;
//
//@Component
//@Slf4j
//public class MyProducer<T> {
//
//    @Autowired
//    PulsarTemplate<T> pulsarTemplate;
//
//
//    /**
//     * 即时消息
//     */
//    public void send(String topic, T message){
//        try {
//            MessageId messageId = pulsarTemplate.send(topic, message);
//        } catch (PulsarClientException e) {
//            log.error("pulsar send error:{}", e.getMessage(), e);
//        }
//    }
//
//    /**
//     * 定时消息
//     */
//    public void sendDeliverAt(String topic, T message, long timestamp){
//        try {
//            MessageId messageId = pulsarTemplate.createMessage(topic, message).deliverAt(timestamp).send();
//        } catch (PulsarClientException e) {
//            log.error("pulsar send deliver at error:{}", e.getMessage(), e);
//        }
//    }
//
//    /**
//     * 延时消息
//     */
//    public void sendDeliverAfter(String topic, T message, Integer delay, TimeUnit timeUnit){
//        try {
//            MessageId messageId = pulsarTemplate.createMessage(topic, message).deliverAfter(delay, timeUnit).send();
//        } catch (PulsarClientException e) {
//            log.error("pulsar send deliver at error:{}", e.getMessage(), e);
//        }
//    }
//}