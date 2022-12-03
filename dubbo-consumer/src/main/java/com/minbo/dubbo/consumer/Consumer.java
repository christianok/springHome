//package com.minbo.dubbo.consumer;
//
//import io.github.majusko.pulsar.annotation.PulsarConsumer;
//import io.github.majusko.pulsar.constant.Serialization;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.pulsar.client.api.PulsarClient;
//import org.apache.pulsar.client.api.SubscriptionType;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//
//
//@Slf4j
//@Component
//public class Consumer {
//    @PulsarConsumer(
//            topic = "payment-topic",  // 订阅topic名称s
//            subscriptionName = "payment-subscription", // 订阅名称
//            clazz = PaymentMessage.class, // 消息类型，
//            // 需要与生产者保持一致，绑定后不能修改类型
//            serialization = Serialization.JSON, // 序列化方式
//            subscriptionType = SubscriptionType.Shared, // 订阅模式，默认为独占模式
//            consumerName = "paymentTopicConsumer", // 消费者名称
//            maxRedeliverCount = 3, // 最大重试次数，达到则放入私信队列
//            deadLetterTopic = "payment_insure_subscription-DLQ" // 死信topic名称
//
//    )
//    public void onMessage(PaymentMessage msg) {
//        //throw new RuntimeException("hello world");
//        // 如果消费失败，请抛出异常，这样消息会进入重试队列，之后可以重新消费，直到达到最大重试次数之后，进入死信队列。前提是要创建重试和死信topic
//        log.info("Received a new message. content: [" + msg + "]");
//    }
//
////    @PulsarConsumer(
////            topic = "payment_insure_subscription-RETRY",
////            subscriptionName = "payment_insure_subscription-RETRY-subscription",
////            clazz = PaymentMessage.class,
////            serialization = Serialization.JSON,
////            subscriptionType = SubscriptionType.Shared,
////            consumerName = "paymentTopicRetryConsumer"
////    )
////    public void onRetryMessage(PaymentMessage msg) {
////        log.info("Received Retry a new message. content: [" + msg + "]");
////
////    }
//
//
////    @PulsarConsumer(
////            topic = "payment_insure_subscription-DLQ",
////            subscriptionName = "payment_insure_subscription",
////            clazz = PaymentMessage.class,
////            serialization = Serialization.JSON,
////            subscriptionType = SubscriptionType.Shared,
////            consumerName = "paymentTopicDLQConsumer"
////    )
////    public void onDeadMessage(PaymentMessage msg) {
////        // 死信队列消息处理，例如将消息持久化存储，发送错误通知人工干预
////        log.info("Received a new dead message. content: [" + msg + "]");
////    }
//}