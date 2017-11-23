package com.nisum.economycart.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.economycart.app.domain.Product;
import com.nisum.economycart.app.service.ProductService;
@RestController
@RequestMapping("/v1/ecart")
public class ProductRestService {
	
	@Autowired
	ProductService productService;

	@RequestMapping(value="/product", method = RequestMethod.GET)
	public List<Product> findAll() {
	return productService.getAllProducts();
	}
}
