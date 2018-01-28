package com.evaluation.entity.locationfinder;

import org.springframework.stereotype.Component;

@Component
public class TxnAddress {
	int txnNumber;
	Addresses addresses;

	public int getTxnNumber() {
		return txnNumber;
	}

	public void setTxnNumber(int txnNumber) {
		this.txnNumber = txnNumber;
	}

	public Addresses getAddresses() {
		return addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

}
