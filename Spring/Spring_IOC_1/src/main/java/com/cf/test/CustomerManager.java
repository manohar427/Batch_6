package com.cf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerManager {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"Spring-Customer.xml");
		Customer c = (Customer)ac.getBean("customer1");
		
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getAge());
	}
}
