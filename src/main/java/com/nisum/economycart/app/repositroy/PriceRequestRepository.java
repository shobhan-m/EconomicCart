package com.nisum.economycart.app.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nisum.economycart.app.domain.PriceRequest;
import com.nisum.economycart.app.domain.Product;
@Repository
public interface PriceRequestRepository extends JpaRepository<PriceRequest, Integer>{

}
