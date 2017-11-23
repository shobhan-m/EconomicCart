package com.nisum.economycart.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nisum.economycart.app.domain.Product;
import com.nisum.economycart.app.domain.User;


/*
 * Sample service to demonstrate what the API would use to get things done
 */
@Service
public interface ProductService {

  


	public User checkIfPriceIsLess(float price, String productId, int userId);

	public List<Product> getAllProducts();
	
	public List<Product> getUpdatedProducts(String emailId);
}
    
