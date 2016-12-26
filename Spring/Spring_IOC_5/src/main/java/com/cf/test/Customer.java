package com.cf.test;

public class Customer {
 private String name;
 private String email;
 private Address address;
 
 public Customer() {
	System.out.println("Customer()-Constructor");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", email=" + email + ", address="
			+ address + "]";
}
 
 
}
