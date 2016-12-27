package com.cf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/Spring-Customer.xml");
	     /*  A cu = (A)ac.getBean("a");
	       System.out.println(cu);*/
		
		/* C c = (C)ac.getBean("c");
	       System.out.println(c);*/
		E e = (E)ac.getBean("e");
	       System.out.println(e);
		
	}

}
