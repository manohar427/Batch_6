package com.cf.test;

public class Customer extends Object{
 private String name;
 private String email;
public Customer(String name, String email) {
	System.out.println(" I am from Customer Contr- two arg");
	this.name = name;
	this.email = email;
}

@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + "]";
}
 public void initiValues(){
	 // DB
	 //Service
	 //File system
	 
	 System.out.println("initiValues()");
 }
 
 public void cleanUpMethod(){
	 System.out.println("cleanUpMethod()");
 }
}
