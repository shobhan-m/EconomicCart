package com.nisum.economycart.app.rest;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 796e6e211a39ce26bb74405f6739d99720728aab
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
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
=======
import com.nisum.economycart.app.service.UserService;

@RestController
@RequestMapping(value="/v1/ecart")
public class UserRestService {
	
	@Autowired
	UserService userService;

	@RequestMapping(value ="/validateUser/{emailId}", method=RequestMethod.GET)
	public boolean validateUser(@PathVariable("emailId") String emailId) {
		boolean validUser = userService.validateUser(emailId);
		return validUser;
>>>>>>> 796e6e211a39ce26bb74405f6739d99720728aab
	}
}
