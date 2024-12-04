package org.ecommerce.kafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.ecommerce.kafkademo.payload.Student;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "demo", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(String.format("Consuming the message from demo topic: %s", msg));

    }

    @KafkaListener(topics = "demo", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(String.format("Consuming the message from demo topic: %s", student));

    }
}
