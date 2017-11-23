package com.nisum.economycart.app.service;

import com.nisum.economycart.app.domain.User;

public interface UserService {
	//
	public boolean validateUser(String emailId);
	public String sendEmail(User user,float changedprice);
}