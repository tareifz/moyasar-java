package com.moyasar.test;

import java.util.List;

import com.moyasar.bean.PaymentResponseBean;
import com.moyasar.bean.SadadPaymentRequestBean;

public class HelloMoyasar {

	
	
	
	public static void main(String[] args) {
		SadadPaymentRequestBean sqr = new SadadPaymentRequestBean();
		sqr.setAmount(120);
		sqr.setUsername("basem");
		sqr.setFail_url("https://dashboard.moyasar.com/sadad/fail");
		sqr.setSuccess_url("https://dashboard.moyasar.com/sadad/success");
		sqr.setCurrency("SAR");
		sqr.setDescription("Testing Java API Wrapprer for Moyasar");
		
		
		System.out.println("STARTING MOYASAR JAVA API TESTING \n\n");
		
		System.out.println(sqr.toString());
		
		System.out.println("THE END OF MOYASAR JAVA API TESTING \n\n");
		
	}
	
	
	public List<PaymentResponseBean> getPaymentTest()
	{
		List<PaymentResponseBean> payments = null; 
		
		return payments; 
	}
	
}
