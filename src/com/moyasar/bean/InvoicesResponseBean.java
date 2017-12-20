package com.moyasar.bean;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class InvoicesResponseBean extends Response {

	@SerializedName("invoices")
	private ArrayList<InvoiceResponseBean> invoices;
	
	@SerializedName("meta")
	private Meta responseMeta;

	public List<InvoiceResponseBean> getInvoices() {
		return invoices;
	}
	
	public Meta getMeta()
	{
		return responseMeta;
	}

	@Override
	public String toString() {
		String invoices; 
		invoices = "PaymentsResponseBean [payments=" ;
		for (InvoiceResponseBean p: this.invoices) {
			invoices+= p.toString() + "\n" ;
		}
		invoices+= "],\nmeta: " + responseMeta.toString();
		return invoices;
	}
}
