package com.nisum.economycart.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.economycart.app.model.Product;
import com.nisum.economycart.app.repositroy.ProductRepository;



/*
 * Sample service to demonstrate what the API would use to get things done
 */
@Service
public class ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository prodRepository;

    
    
    public ProductService() {
    }

  
    
    public List<Product> getAllProducts() {
        List<Product> pageOfProducts = (List<Product>) prodRepository.findAll();
        
        return pageOfProducts;
    }
    
    public Product findByProdcutId(String prodId){
    	log.info("prod id:"+prodId);
    	Product product= prodRepository.findByProductId(prodId);
    	return product;
    
    }

    public void updateProduct(Product product) {
	  Product  	prod=prodRepository.findByProductId(product.getProductId());
	  //log.info("size of list--"+prod.size());
	  //for(Product prods: prod) {
		  prod.setProductName(product.getProductName());
		  prod.setProductDesc(product.getProductDesc());
		  prod.setQuantity(product.getQuantity());
		  prod.setProductType(product.getProductType());
	 // }
	    	prodRepository.save(prod);
	    }

    public void deleteProduct(String id) {
    	Product   product=	prodRepository.findByProductId(id);
    	//log.info("in product serive delete size**"+product.size());
   	
    	prodRepository.delete(product);
    }
    public Product getProduct(String id) {
        return prodRepository.findOne(id);
    }
    
  }
