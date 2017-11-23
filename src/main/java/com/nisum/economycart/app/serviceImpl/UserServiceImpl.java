package com.nisum.economycart.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.economycart.app.domain.User;
import com.nisum.economycart.app.repositroy.UserRepository;
import com.nisum.economycart.app.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
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

}
