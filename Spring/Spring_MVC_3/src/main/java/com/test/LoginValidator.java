package com.test;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator{
	
public void validate(Object arg0, Errors arg1) {
	Login login = (Login)arg0;
	
	if(login.getUsername() == null ||login.getUsername().length() == 0){
		arg1.rejectValue("username", "username.required","Please Enter username");
	}
	if(login.getPassword() == null ||login.getPassword().length() == 0){
		arg1.rejectValue("password", "password.required","Please Enter password");
	}
}
public boolean supports(Class arg0) {
		
		return arg0.equals(Login.class);
	}
}
