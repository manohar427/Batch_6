package com.test;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegistrationFormValidator implements Validator{
	
public void validate(Object arg0, Errors arg1) {
	RegistrationForm login = (RegistrationForm)arg0;
	System.out.println("OK Login Validator");
	if(login.getFirstName() == null ||login.getFirstName().length() == 0){
		arg1.rejectValue("firstName", "firstName.required","Please Enter username");
		System.out.println("Fn required");
	}
	if(login.getLastName() == null ||login.getLastName().length() == 0){
		arg1.rejectValue("lastName", "lastName.required","Please Enter password");
		System.out.println("Ln required");
	}
	if(login.getResume() == null ||login.getResume().getOriginalFilename().length() == 0){
		arg1.rejectValue("resume", "resume.required","Please select CV");
		System.out.println("CV required");
	}
}
public boolean supports(Class arg0) {
		
		return arg0.equals(RegistrationForm.class);
	}
}
