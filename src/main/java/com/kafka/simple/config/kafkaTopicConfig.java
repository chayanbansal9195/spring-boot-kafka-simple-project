package com.kafka.simple.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {
//creating topic in kafka cluster
//create kafka producer
//create kafka consumer
	@Bean
	public NewTopic kafkaTopic() {
		return TopicBuilder.name("kafkatopic").build();
	}
}
