package com.moyasar.bean;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PaymentsResponseBean {

	@SerializedName("payments")
	ArrayList<PaymentResponseBean> payments;

	public List<PaymentResponseBean> getPayments() {
		return payments;
	}

	@Override
	public String toString() {
		String payments; 
		payments = "PaymentsResponseBean [payments=" ;
		for (PaymentResponseBean p: this.payments) {
			payments+= p.toString() ;
		}
		payments+= "]";
		return payments;
	}
	
	
}
