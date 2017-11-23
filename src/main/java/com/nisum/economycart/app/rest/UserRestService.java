package com.nisum.economycart.app.rest;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	}
}
