package com.nisum.economycart.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.economycart.app.dto.UserDto;
import com.nisum.economycart.app.service.EmailAccount;
import com.nisum.economycart.app.util.EmailAlert;


@RestController
public class UserRestService {
	
	UserDto userDto=new UserDto();
	
	  static EmailAccount emailAccount;
	
	@RequestMapping(value = "/sendEmail", method = RequestMethod.GET)
	public String sendEmail() throws Exception {
		
		
		EmailAlert emailAlert= new EmailAlert();
		emailAlert.send(emailAccount.getAdminemail(),emailAccount.getAdminpassword(),emailAccount.getToEmailId(),
				emailAccount.getSubject(),"Welcome message... ");
		
		return "Success";
	}
	
	
	@Autowired
	public void setEmailAccount(EmailAccount emailAccount) {
		UserRestService.emailAccount = emailAccount;
	}
}
