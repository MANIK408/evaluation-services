package com.evaluation.services;

import org.springframework.stereotype.Component;

@Component
public interface IMessagingServices {
	<T> void convertAndSend(String exchange, String routingKey, T object);
}
