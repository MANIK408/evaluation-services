package com.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.dao.TransactionDaoImpl;
import com.evaluation.entity.locationfinder.Locations;
import com.evaluation.entity.property.Properties;

@RestController
public class QueryResultController {
	@Autowired
	TransactionDaoImpl transactionDaoImpl;

	@RequestMapping(value = "/query-address/{txn_key}", method = RequestMethod.GET)
	public Locations getAddress(@PathVariable("txn_key") int txnId) {
		Locations locationEntity = transactionDaoImpl.getAddress(txnId);
		return locationEntity;
	}

	@RequestMapping(value = "/query-property/{txn_key}", method = RequestMethod.GET)
	public Properties getProperty(@PathVariable("txn_key") int txnId) {
		Properties propertyEntity = transactionDaoImpl.getProperty(txnId);
		return propertyEntity;
	}
}
