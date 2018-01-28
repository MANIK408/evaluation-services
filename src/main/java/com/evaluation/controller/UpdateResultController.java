package com.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.dao.TransactionDaoImpl;
import com.evaluation.entity.locationfinder.TxnAddress;
import com.evaluation.entity.property.TxnProperty;

@RestController
public class UpdateResultController {
	@Autowired
	TransactionDaoImpl transactionDaoImpl;

	@RequestMapping(value = "/update-address", method = RequestMethod.POST)
	public void updateAddress(@RequestBody TxnAddress addresses) {
		System.out.println("Controller Update Address = " + addresses);
		transactionDaoImpl.updateAddress(addresses);
	}

	@RequestMapping(value = "/update-property", method = RequestMethod.POST)
	public void updateProperty(@RequestBody TxnProperty property) {
		System.out.println("Controller Update Property = " + property);
		transactionDaoImpl.updateProperty(property);

	}
}
