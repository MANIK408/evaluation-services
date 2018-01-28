package com.evaluation.entity.locationfinder;

import org.springframework.stereotype.Component;

@Component
public class Locations {
	int txnNumber;

	String searchLocation;

	String locationStatus;

	String locationJson;

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

	public String getLocationStatus() {
		return locationStatus;
	}

	public void setLocationStatus(String locationStatus) {
		this.locationStatus = locationStatus;
	}

	public String getLocationJson() {
		return locationJson;
	}

	public void setLocationJson(String locationJson) {
		this.locationJson = locationJson;
	}

}
