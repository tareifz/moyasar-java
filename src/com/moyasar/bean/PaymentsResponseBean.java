package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PaymentsResponseBean extends Response {

	@SerializedName("payments")
	private ArrayList<PaymentResponseBean> payments;
	
	@SerializedName("meta")
	private Meta responseMeta;

	public List<PaymentResponseBean> getPayments() {
		return payments;
	}
	
	public Meta getMeta()
	{
		return responseMeta;
	}

	@Override
	public String toString() {
		String payments; 
		payments = "PaymentsResponseBean [payments=" ;
		for (PaymentResponseBean p: this.payments) {
			payments+= p.toString() + "\n" ;
		}
		payments+= "],\nmeta: " + responseMeta.toString();
		return payments;
	}
	
	
}
