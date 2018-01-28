package com.evaluation.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evaluation.common.Status;
import com.evaluation.entity.SearchCriteria;
import com.evaluation.entity.dto.TransactionDto;
import com.evaluation.entity.locationfinder.Locations;
import com.evaluation.entity.locationfinder.TxnAddress;
import com.evaluation.entity.property.Properties;
import com.evaluation.entity.property.TxnProperty;
import com.evaluation.transferobject.SearchTransferObject;

@Transactional
@Component
public class TransactionDaoImpl {
	@Autowired
	TransactionDao transactionDao;

	public void updateAddress(TxnAddress addresses) {
		TransactionDto entity = transactionDao.findOne(addresses.getTxnNumber());
		entity.setLocationStatus(Status.DONE.toString());
		entity.setLocationJson(addresses.getAddresses().getAddressLocateds().get(0).getAddress());
		transactionDao.save(entity);
	}

	public void updateProperty(TxnProperty property) {
		TransactionDto entity = transactionDao.findOne(property.getTxnNumber());
		entity.setPropertyStatus(Status.DONE.toString());
		entity.setPropertyJson(property.getBulkBean().getDisclaimer());
		transactionDao.save(entity);
	}

	public Locations getAddress(int txnId) {
		TransactionDto entity = transactionDao.findOne(txnId);
		Locations locationEntity = null;
		if (null != entity) {
			locationEntity = new Locations();
			locationEntity.setTxnNumber(entity.getTxnNumber());
			locationEntity.setSearchLocation(entity.getSearchLocation());
			if (Status.SENT.toString().equals(entity.getLocationStatus()))
				locationEntity.setLocationStatus(entity.getLocationStatus() + "--> Request has sent to the Host");
			else if (Status.PROCESSING.toString().equals(entity.getLocationStatus()))
				locationEntity.setLocationStatus(entity.getLocationStatus() + "--> Request is in processing phase");
			else if (Status.DONE.toString().equals(entity.getLocationStatus())) {
				locationEntity.setLocationStatus(
						entity.getLocationStatus() + "--> Request is processed, please see the Result");
				locationEntity.setLocationJson(entity.getLocationJson());
			} else
				locationEntity.setLocationStatus("STATUS UN-KNOWN. Please contact to the admin");
		}
		return locationEntity;
	}

	public Properties getProperty(int txnId) {
		TransactionDto entity = transactionDao.findOne(txnId);
		Properties propertyEntity = null;
		if (null != entity) {
			propertyEntity = new Properties();
			propertyEntity.setTxnNumber(entity.getTxnNumber());
			propertyEntity.setSearchProperty(entity.getSearchMls());
			if (Status.SENT.toString().equals(entity.getPropertyStatus()))
				propertyEntity.setPropertyStatus(entity.getPropertyStatus() + "--> Request has sent to the Host");
			else if (Status.PROCESSING.toString().equals(entity.getPropertyStatus()))
				propertyEntity.setPropertyStatus(entity.getPropertyStatus() + "--> Request is in processing phase");
			else if (Status.DONE.toString().equals(entity.getPropertyStatus())) {
				propertyEntity.setPropertyStatus(
						entity.getPropertyStatus() + "--> Request is processed, please see the Result");
				propertyEntity.setPropertyJson(entity.getPropertyJson());
			} else
				propertyEntity.setPropertyStatus("STATUS UN-KNOWN. Please contact to the admin");
		}
		return propertyEntity;
	}

	public TransactionDto save(SearchCriteria criteria) {
		TransactionDto dto = SearchTransferObject.prepareDtoForSave(criteria);
		dto = transactionDao.save(dto);
		return dto;
	}

	public void setTransactionDao(TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}

}
