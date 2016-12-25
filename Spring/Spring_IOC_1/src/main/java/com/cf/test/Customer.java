package com.cf.test;

public class Customer {

	String name;
	String email;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
