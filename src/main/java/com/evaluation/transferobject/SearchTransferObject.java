package com.evaluation.transferobject;

import com.evaluation.common.Status;
import com.evaluation.entity.SearchCriteria;
import com.evaluation.entity.dto.TransactionDto;

public class SearchTransferObject {
	public static TransactionDto prepareDtoForSave(SearchCriteria criteria) {
		TransactionDto dto = new TransactionDto();
		dto.setSearchLocation(criteria.getSearchLocation());
		dto.setSearchMls(criteria.getSearchMls());
		dto.setLocationStatus(Status.SENT.toString());
		dto.setPropertyStatus(Status.SENT.toString());
		return dto;
	}
}
