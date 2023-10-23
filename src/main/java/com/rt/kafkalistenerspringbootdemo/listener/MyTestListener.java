package com.rt.kafkalistenerspringbootdemo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class MyTestListener {

    @KafkaListener(topics = "${test-event-topic-name}")
    public void consume(
            String message,
            Acknowledgment acknowledgment,
            @Header(KafkaHeaders.RECEIVED_TOPIC) String realTopic) {

        System.out.println(message);

        acknowledgment.acknowledge();
    }
}
