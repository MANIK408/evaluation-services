package com.evaluation.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagingServicesHandler implements IMessagingServices {
	@Autowired
	RabbitTemplate rabbitTemplate;

	@Override
	public <T> void convertAndSend(String exchange, String routingKey, T object) {
		rabbitTemplate.convertAndSend(exchange, routingKey, object);
	}

}
