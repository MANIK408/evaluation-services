package com.evaluation.services;

import org.springframework.stereotype.Component;

import com.evaluation.dao.TransactionDaoImpl;
import com.evaluation.entity.SearchCriteria;
import com.evaluation.entity.dto.TransactionDto;

@Component
public class SearchServices {

	TransactionDaoImpl transactionDaoImpl;
	IMessagingServices iMessagingServices;

	SearchServices(TransactionDaoImpl transactionDaoImpl, MessagingServicesHandler messagingServicesHandler) {
		this.transactionDaoImpl = transactionDaoImpl;
		iMessagingServices = messagingServicesHandler;
	}

	public Integer sendMessage(SearchCriteria criteria) {
		TransactionDto entity = transactionDaoImpl.save(criteria);
		iMessagingServices.convertAndSend("spring-boot-exchange", "x1", entity);
		return entity.getTxnNumber();
	}
}
