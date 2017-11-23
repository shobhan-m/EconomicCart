package com.nisum.economycart.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.economycart.app.domain.Product;
import com.nisum.economycart.app.domain.User;
import com.nisum.economycart.app.repositroy.ProductRepository;
import com.nisum.economycart.app.repositroy.UserRepository;



/*
 * Sample service to demonstrate what the API would use to get things done
 */
@Service
public class ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository prodRepository;
    
    @Autowired
    private UserRepository userRepository;

    
    
    public ProductService() {
    }


	public User checkIfPriceIsLess(float price, String productId, long userId) {
		// TODO Auto-generated method stub
		
		float oldprice = prodRepository.getPrice(productId);
		
		User user = userRepository.findOne(userId);			
		
		if(price<oldprice) return user; 
		else 
		return null;
	}
    
  }
