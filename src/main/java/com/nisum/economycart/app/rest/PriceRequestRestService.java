package com.nisum.economycart.app.rest;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.economycart.app.domain.PriceRequest;
import com.nisum.economycart.app.service.PriceRequestService;

@RestController
@RequestMapping("/e1")
public class PriceRequestRestService {

	@Autowired
	PriceRequestService priceRequestService;

	@RequestMapping("/savePriceRequest")
	public ResponseEntity<?> savePriceRequest(PriceRequest priceRequest) {
		ResponseEntity<?> responseEntity = null;
		try {
			PriceRequest addPriceRequest = priceRequestService.addPriceRequest(priceRequest);
			if (ObjectUtils.anyNotNull(addPriceRequest)) {
				responseEntity = new ResponseEntity<String>("Success", HttpStatus.OK);
			}
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

}
