package com.nisum.economycart.app.service;

import org.springframework.stereotype.Service;

import com.nisum.economycart.app.domain.PriceRequest;

public interface PriceRequestService {
	public PriceRequest addPriceRequest(PriceRequest priceRequest);
}