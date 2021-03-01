package com.kafka.listener;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.User;

@RestController
public class Consumer {

	List<String> message = new ArrayList<>();
	
	@GetMapping("/consume")
	public List<String> consumer(){
		System.out.println(" "+message);
		return message;
	}
	
	
	
	
	@KafkaListener(groupId = "group_id" , topics = "kafka_sample")
	public List<String> getmsg(String data){
		message.add(data);
		return message;
	}
	
	@KafkaListener(topics = "kafka_sample" , groupId = "group_json" , containerFactory = "userkf")
	public void consumejson(User user) {
		System.out.println("Consumed JSON : " +user);
	}
}
