package com.evaluation.entity.locationfinder;

import org.springframework.stereotype.Component;

@Component
public class AddressLocated {
	String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
