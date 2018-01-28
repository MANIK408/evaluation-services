package com.evaluation.entity.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TransactionEntity")
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
public class TransactionDto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	int txnNumber;

	String searchLocation;

	int searchMls;

	@NotNull
	String locationStatus;

	@NotNull
	String propertyStatus;

	String locationJson;

	String propertyJson;

	public int getTxnNumber() {
		return txnNumber;
	}

	public void setTxnNumber(int txnNumber) {
		this.txnNumber = txnNumber;
	}

	public String getSearchLocation() {
		return searchLocation;
	}

	public void setSearchLocation(String searchLocation) {
		this.searchLocation = searchLocation;
	}

	public int getSearchMls() {
		return searchMls;
	}

	public void setSearchMls(int searchMls) {
		this.searchMls = searchMls;
	}

	public String getLocationStatus() {
		return locationStatus;
	}

	public void setLocationStatus(String locationStatus) {
		this.locationStatus = locationStatus;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	public String getLocationJson() {
		return locationJson;
	}

	public void setLocationJson(String locationJson) {
		this.locationJson = locationJson;
	}

	public String getPropertyJson() {
		return propertyJson;
	}

	public void setPropertyJson(String propertyJson) {
		this.propertyJson = propertyJson;
	}

}
