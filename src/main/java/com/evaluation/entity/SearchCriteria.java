package com.evaluation.entity;

import org.springframework.stereotype.Component;

@Component
public class SearchCriteria {

	String searchLocation;

	int searchMls;

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

}
