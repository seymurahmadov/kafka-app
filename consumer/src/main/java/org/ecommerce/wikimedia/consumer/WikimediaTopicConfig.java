package org.ecommerce.wikimedia.consumer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class WikimediaTopicConfig {
    @Bean
    public NewTopic wikimediaTopic() {
        return TopicBuilder
                .name("wikimedia-stream")
//                .partitions(5)
                .build();

    }
}
