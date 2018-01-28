package com.evaluation.entity.property;

import org.springframework.stereotype.Component;

@Component
public class Properties {
	int txnNumber;

	int searchProperty;

	String propertyStatus;

	String propertyJson;

	public int getTxnNumber() {
		return txnNumber;
	}

	public void setTxnNumber(int txnNumber) {
		this.txnNumber = txnNumber;
	}

	public int getSearchProperty() {
		return searchProperty;
	}

	public void setSearchProperty(int searchProperty) {
		this.searchProperty = searchProperty;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	public String getPropertyJson() {
		return propertyJson;
	}

	public void setPropertyJson(String propertyJson) {
		this.propertyJson = propertyJson;
	}

}
