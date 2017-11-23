package com.nisum.economycart.app.serviceImpl;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.nisum.economycart.app.domain.PriceRequest;
import com.nisum.economycart.app.dto.ServiceStatusDto;
import com.nisum.economycart.app.repositroy.PriceRequestRepository;
import com.nisum.economycart.app.service.PriceRequestService;
import com.nisum.economycart.app.util.Constants;

@Configuration
public class PriceRequestServiceImpl implements PriceRequestService {
	private static Logger logger = LoggerFactory.getLogger(PriceRequestServiceImpl.class);
	@Autowired
	PriceRequestRepository priceRequestRepository;

	@Override
	public ServiceStatusDto addPriceRequest(PriceRequest priceRequest) {
		logger.info("PriceRequestServiceImpl : addPriceRequest : "+ priceRequest.toString());
		ServiceStatusDto status = new ServiceStatusDto();
		LocalDateTime presentDate = LocalDateTime.now();
		Timestamp createDate = Timestamp.valueOf(presentDate);
		int daysRange = priceRequest.getSelectDaysRange();
		LocalDateTime featureDate = presentDate.plusDays(daysRange);
		Timestamp toDate = Timestamp.valueOf(featureDate);
		priceRequest.setCreateDate(createDate);
		priceRequest.setToDate(toDate);
		priceRequest = priceRequestRepository.save(priceRequest);
		if (ObjectUtils.anyNotNull(priceRequest)) {
			logger.info("PriceRequestServiceImpl : addPriceRequest : Inside If Condition");
			status.setStatus(true);
			status.setMessage(Constants.PRICE_REQUEST_SUCCESS);
			return status;
		} else {
			logger.info("PriceRequestServiceImpl : addPriceRequest : Inside else Condition");
			status.setStatus(false);
			status.setMessage(Constants.PRICE_REQUEST_FAILED);
		}
		return status;
	}

}
