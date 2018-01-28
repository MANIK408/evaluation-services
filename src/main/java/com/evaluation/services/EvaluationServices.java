package com.evaluation.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.evaluation.common.Status;
import com.evaluation.dao.TransactionDao;
import com.evaluation.entity.dto.TransactionDto;

@Component

public class EvaluationServices implements CommandLineRunner {

	private final IMessagingServices iMessagingServices;
	private final ConfigurableApplicationContext context;
	private final TransactionDao transactionDao;

	public EvaluationServices(MessagingServicesHandler messagingServicesHandler, ConfigurableApplicationContext context,
			TransactionDao transactionDao) {
		this.iMessagingServices = messagingServicesHandler;
		this.context = context;
		this.transactionDao = transactionDao;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending message...");
		TransactionDto entity = new TransactionDto();
		entity.setSearchLocation("1960 Eglinton");
		entity.setSearchMls(1005213);
		entity.setLocationStatus(Status.SENT.toString());
		entity.setPropertyStatus(Status.SENT.toString());
		// transactionDao.save(entity);
		entity.getTxnNumber();
		System.out.println("--Txn Id--" + entity.getTxnNumber());
		// iMessagingServices.convertAndSend("spring-boot-exchange", "x1",
		// entity);
		Thread.sleep(10000000);
		context.close();
	}
}
