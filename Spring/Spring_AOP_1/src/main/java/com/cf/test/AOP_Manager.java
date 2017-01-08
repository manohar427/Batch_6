package com.cf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cf.test.CustomerService;

public class AOP_Manager {
	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("Spring-Customer.xml"));
		CustomerService cust = (CustomerService) bf.getBean("customerServiceProxy");
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {
          System.out.println(e.getMessage());
		}

	}
}