package com.nisum.economycart.app.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.economycart.app.domain.Product;
import com.nisum.economycart.app.domain.User;
import com.nisum.economycart.app.repositroy.PriceRequestRepository;
import com.nisum.economycart.app.repositroy.ProductRepository;
import com.nisum.economycart.app.repositroy.UserRepository;
import com.nisum.economycart.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static final Logger log = LoggerFactory.getLogger(ProductService.class);

	@Autowired
	private ProductRepository prodRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	PriceRequestRepository priceRequestRepository;

	public User checkIfPriceIsLess(float price, String productId, int userId) {
		// TODO Auto-generated method stub

		float oldprice = prodRepository.getPrice(productId);

		User user = userRepository.findOne(userId);

		if (price < oldprice)
			return user;
		else
			return null;
	}

	public List<Product> getAllProducts() {
		return (List<Product>) prodRepository.findAll();
	}

	@Override
	public List<Product> getUpdatedProducts(String emailId) {

		emailId = emailId + ".com";
		return prodRepository.getUpdatedProductDetails(emailId);
	}

}
