package com.nisum.economycart.app.repositroy;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.nisum.economycart.app.domain.Product;

import java.lang.String;
import java.util.List;


@Transactional
public interface ProductRepository extends JpaRepository<Product, String>{
	
Product findByProductId(String productid);

@Query("select p.productPrice from Product p where productId=:productId")
public float getPrice(@Param("productId") String productId);

@Query(value = "SELECT p FROM Product p where p.productId IN (SELECT pr.productId from PriceRequest pr where pr.emailId=:emailId)")
public List<Product> getUpdatedProductDetails(@Param("emailId") String emailId);


}
