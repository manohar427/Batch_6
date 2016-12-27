package com.cf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerManger {

	public static void main(String[] args) {
       ApplicationContext ac = new ClassPathXmlApplicationContext("com/Spring-Customer.xml");
       Customer cu = (Customer)ac.getBean("customer");
       System.out.println(cu);
       
       Customer cu1 = (Customer)ac.getBean("customer");
       System.out.println(cu1);
       
	}

}