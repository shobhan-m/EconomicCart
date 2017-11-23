package com.nisum.economycart.app.repositroy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nisum.economycart.app.domain.User;

//import com.app.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
