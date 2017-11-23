package com.nisum.economycart.app.rest;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.economycart.app.domain.PriceRequest;
import com.nisum.economycart.app.dto.ServiceStatusDto;
import com.nisum.economycart.app.service.PriceRequestService;
import com.nisum.economycart.app.serviceImpl.PriceRequestServiceImpl;
import com.nisum.economycart.app.util.Constants;
import com.nisum.economycart.app.util.Errors;

@RestController
@RequestMapping(value = "/e1/priceRequest")
public class PriceRequestRestService {
	private static Logger logger = LoggerFactory.getLogger(PriceRequestRestService.class);
	@Autowired
	PriceRequestService priceRequestService;

	@RequestMapping(value = "/savePriceRequest", method = RequestMethod.POST)
	public ResponseEntity<?> savePriceRequest(@RequestBody PriceRequest priceRequest) {
		logger.info("PriceRequestRestService : savePriceRequest : "+ priceRequest.toString());
		ResponseEntity<?> responseEntity = null;
		try {
			ServiceStatusDto statusDto = priceRequestService.addPriceRequest(priceRequest);
			responseEntity = new ResponseEntity<ServiceStatusDto>(statusDto, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("PriceRequestRestService : savePriceRequest : Contact Customer Care !!");
			Errors error = new Errors();
			error.setErrorCode("BAD REQUEST");
			error.setErrorMessage(Constants.MSG_UPDATE_ECART_FAILED);
			responseEntity = new ResponseEntity<Errors>(error, HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
	@RequestMapping(value = "/getPriceRequest", method = RequestMethod.GET)
	public ResponseEntity<?> savePriceRequest() {
		logger.info("PriceRequestRestService : savePriceRequest : ");
		PriceRequest priceRequest = new PriceRequest();
		priceRequest.setComment("testComment");
		priceRequest.setEmailId("dhirajkishores@gmail.com");
		priceRequest.setCreateDate(new Timestamp(System.currentTimeMillis()));
		priceRequest.setFromPrice(10);
		priceRequest.setProductId(1);
		priceRequest.setRequestId(1);
		LocalDateTime presentDate = LocalDateTime.now();
		Timestamp createDate = Timestamp.valueOf(presentDate);
		int daysRange = priceRequest.getSelectDaysRange();
		LocalDateTime featureDate = presentDate.plusDays(5);
		Timestamp toDate = Timestamp.valueOf(featureDate);
		priceRequest.setToDate(toDate);
		priceRequest.setToPrice(50);
		ResponseEntity<?> responseEntity = null;
		try {
			ServiceStatusDto statusDto = priceRequestService.addPriceRequest(priceRequest);
			responseEntity = new ResponseEntity<ServiceStatusDto>(statusDto, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("PriceRequestRestService : savePriceRequest : Contact Customer Care !!");
			Errors error = new Errors();
			error.setErrorCode("BAD REQUEST");
			error.setErrorMessage(Constants.MSG_UPDATE_ECART_FAILED);
			responseEntity = new ResponseEntity<Errors>(error, HttpStatus.NOT_ACCEPTABLE);
		}
		return responseEntity;
	}
}
