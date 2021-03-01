package com.kafka.model;

public class User {

	private String name;
	private String location;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, String location, int age) {
		this.name = name;
		this.location = location;
		this.age = age;
	}
	
	
	
}
