package com.cf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressManger {

	public static void main(String[] args) {
       ApplicationContext ac = new ClassPathXmlApplicationContext("com/Spring-Address.xml");
       Address ad = (Address)ac.getBean("address");
       
       System.out.println(ad);
	}

}