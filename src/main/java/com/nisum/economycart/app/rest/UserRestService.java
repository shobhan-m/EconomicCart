package com.nisum.economycart.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.economycart.app.service.EmailAccount;
import com.nisum.economycart.app.service.UserService;
import com.nisum.economycart.app.util.EmailAlert;

@RestController
@RequestMapping(value = "/v1/ecart")
public class UserRestService {

	@Autowired
	UserService userService;
	
	static EmailAccount emailAccount;

	@RequestMapping(value = "/sendEmail", method = RequestMethod.GET)
	public String sendEmail() throws Exception {

		EmailAlert emailAlert = new EmailAlert();
		emailAlert.send(emailAccount.getAdminemail(), emailAccount.getAdminpassword(), 
				emailAccount.getToEmailId(),
				emailAccount.getSubject(), "Welcome message... ");

		return "Success";
	}

	@RequestMapping(value = "/validateUser/{emailId}", method = RequestMethod.GET)
	public boolean validateUser(@PathVariable("emailId") String emailId) {
		boolean validUser = userService.validateUser(emailId);
		return validUser;
	}
		@Autowired
	public void setEmailAccount(EmailAccount emailAccount) {
		UserRestService.emailAccount = emailAccount;
	}
}
