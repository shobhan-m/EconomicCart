package com.nisum.economycart.app.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.economycart.app.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByEmailId(String emailId); 
	
	

}
