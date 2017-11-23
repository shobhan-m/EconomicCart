package com.nisum.economycart.app.repositroy;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nisum.economycart.app.domain.Product;

import java.lang.String;
import java.util.List;


@Transactional
public interface ProductRepository extends CrudRepository<Product, String>{
	
Product findByProductId(String productid);

@Query("select productPrice from Product where productId=:productId")
public float getPrice(@Param("productId") String productId);

}
