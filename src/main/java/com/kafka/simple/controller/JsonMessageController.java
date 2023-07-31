package com.kafka.simple.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.simple.kafka.JsonKafkaProducer;
import com.kafka.simple.payload.User;

@RestController
public class JsonMessageController {

	private JsonKafkaProducer jsonKafkaProducer;

	public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
		this.jsonKafkaProducer = jsonKafkaProducer;
	}

	@PostMapping("/publishJson")
	public ResponseEntity<String> publishJson(@RequestBody User user){
		jsonKafkaProducer.sendMessage(user);
		return new ResponseEntity<>("Json Message sent to Kafka topic %s", HttpStatus.OK);
	}
	
}
