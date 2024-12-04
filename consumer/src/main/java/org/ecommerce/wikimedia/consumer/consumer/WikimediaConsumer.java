package org.ecommerce.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMsg(String msg) {
//        System.out.println(msg);
        log.info(String.format("Consuming the message from wikimedia-stream topic: %s", msg));
    }
}
