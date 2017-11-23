package com.nisum.economycart.app.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.economycart.app.domain.PriceRequest;
@Repository
public interface PriceRequestRepository extends JpaRepository<PriceRequest, Integer>{

}
