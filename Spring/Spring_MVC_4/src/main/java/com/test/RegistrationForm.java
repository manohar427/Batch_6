package com.test;

import org.springframework.web.multipart.MultipartFile;

public class RegistrationForm {
private String firstName;
private String lastName;
private MultipartFile resume;



public MultipartFile getResume() {
	return resume;
}
public void setResume(MultipartFile resume) {
	this.resume = resume;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
