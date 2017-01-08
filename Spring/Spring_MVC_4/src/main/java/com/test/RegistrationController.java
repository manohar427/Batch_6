package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


/**
 * Servlet implementation class RegistrationController
 */
@SuppressWarnings("deprecation")
public class RegistrationController extends SimpleFormController {
       
   @Override
protected ModelAndView onSubmit(HttpServletRequest request,
		HttpServletResponse response, Object command, BindException errors)
		throws Exception {
	// TODO Auto-generated method stub
	   
	   try
	   {
		 //  int i =9/0;
		  // throw new UploadException();
		   /*if(true)
		   {
			   throw new UploadException("Upload Exception message");
		   }*/
	   }catch(Exception e)
	   {
		   throw e;
	   }
	  
	   return new ModelAndView("success.jsp", "registrationStatus", "Registration Successfully done"); 
	   
	//return new ModelAndView("success.jsp");
}

}
