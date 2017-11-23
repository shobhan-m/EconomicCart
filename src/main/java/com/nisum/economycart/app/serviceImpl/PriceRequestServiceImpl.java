package com.nisum.economycart.app.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.nisum.economycart.app.domain.PriceRequest;
import com.nisum.economycart.app.repositroy.PriceRequestRepository;
import com.nisum.economycart.app.service.PriceRequestService;
@Configuration
public class PriceRequestServiceImpl implements PriceRequestService{

	@Autowired
	PriceRequestRepository priceRequestRepository;
	@Override
	public PriceRequest addPriceRequest(PriceRequest priceRequest) {
		LocalDateTime createDate = LocalDateTime.now();
		int daysRange = priceRequest.getSelectDaysRange();
		LocalDateTime toDate = createDate.plusDays(daysRange);
		priceRequest.setCreateDate(createDate);
		priceRequest.setToDate(toDate);
		priceRequest = priceRequestRepository.save(priceRequest);
		return priceRequest;
	}

}
