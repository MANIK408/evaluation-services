package com.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.entity.SearchCriteria;
import com.evaluation.services.SearchServices;

@RestController
public class SearchController {

	@Autowired
	SearchServices searchServices;

	@RequestMapping(value = "/messages", method = RequestMethod.POST)
	public String sendMessage(@RequestBody SearchCriteria criteria) {
		String message = "Keep the transaction No to check the status. Transaction No is:- ";
		Integer txnId = searchServices.sendMessage(criteria);
		if (null != txnId)
			return message + txnId.toString();
		else
			return "Invalid Request";
	}
}
