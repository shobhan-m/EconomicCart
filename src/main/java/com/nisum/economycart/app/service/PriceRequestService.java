package com.nisum.economycart.app.service;


import com.nisum.economycart.app.domain.PriceRequest;
import com.nisum.economycart.app.dto.ServiceStatusDto;

public interface PriceRequestService {
	public ServiceStatusDto addPriceRequest(PriceRequest priceRequest);
}