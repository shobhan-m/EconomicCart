package com.nisum.economycart.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.economycart.app.domain.User;
import com.nisum.economycart.app.repositroy.UserRepository;
import com.nisum.economycart.app.service.EmailAccount;
import com.nisum.economycart.app.service.UserService;
import com.nisum.economycart.app.util.EmailAlert;
import com.nisum.economycart.app.util.MailSender;

@Service
public class UserServiceImpl implements UserService{

	static EmailAccount emailAccount;
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public boolean validateUser(String emailId) {
		emailId = emailId + ".com";
		User user = userRepository.findByEmailId(emailId);
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public String sendEmail(User user) {
		System.out.println("In sendEmail");
		user = new User();
		user.setName("Dheeraj");
		EmailAlert emailAlert = new EmailAlert();
		//System.out.println("email and password are......"+ emailAccount.getAdminemail() + emailAccount.getAdminpassword());
		emailAlert.send("smamidala@nisum.com", "Orange#1234", 
				"dsingh@nisum.com",
				"Welcome to Economy cart...", MailSender.messageBody(user.getName()));

		return "Success";
	}

}
