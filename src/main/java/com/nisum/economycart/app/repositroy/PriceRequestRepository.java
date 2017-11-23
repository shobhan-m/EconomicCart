package com.nisum.economycart.app.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nisum.economycart.app.domain.PriceRequest;
@Repository
public interface PriceRequestRepository extends JpaRepository<PriceRequest, Integer>{
	
<<<<<<< Updated upstream
	@Query(value="SELECT pr.productId from PriceRequest pr where pr.emailId=:emailId")
	public List<Integer> getProductIds(@Param("emailId") String emailId);
=======
	@Query("select pr.fromPrice from PriceRequest pr where productId=:productId")
	public float findPrice(@Param("productId") int productId);

	@Query("select pr.emailId from PriceRequest pr where productId=:productId")
	public String findUser(@Param("productId") int productId);
>>>>>>> Stashed changes

}
