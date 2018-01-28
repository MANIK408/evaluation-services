package com.evaluation.entity.locationfinder;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Addresses {
	private List<AddressLocated> addressLocateds;

	public List<AddressLocated> getAddressLocateds() {
		return addressLocateds;
	}

	public void setAddressLocateds(List<AddressLocated> addressLocateds) {
		this.addressLocateds = addressLocateds;
	}

}
