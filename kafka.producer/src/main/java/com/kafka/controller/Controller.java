package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.User;

@RestController
@RequestMapping("kafka")
public class Controller {

	@Autowired
	private KafkaTemplate<String , User> kafka;
	
	private static final String TOPIC = "kafka_sample";
	
	@GetMapping("/publish/{name}/{location}/{age}")
	public String post(@PathVariable("name") final String name ,
						@PathVariable("location") final String location, 
						@PathVariable("age") final int age) {
		
		kafka.send(TOPIC, new User (name, location, age));
		
		return "Message Sent";
	}
}
