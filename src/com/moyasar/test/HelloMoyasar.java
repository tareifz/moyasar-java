package com.moyasar.test;

import com.moyasar.bean.PaymentsResponseBean;
import com.moyasar.bean.SadadPaymentRequestBean;
import com.moyasar.main.MoyasarClient;

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
		
		System.out.println("STARTING MOYASAR JAVA API GET PAYMENTS TESTING \n\n");
		getPaymentTest();
		System.out.println("THE END OF MOYASAR JAVA API GET PAYMENTS TESTING \n\n");
		
	}
	
	
	public static PaymentsResponseBean getPaymentTest()
	{
		MoyasarClient c = new MoyasarClient("132", "123");
		PaymentsResponseBean payments = null; 
		
		payments = c.getAllPayments();
		
		
		c.getPayment("f894b206-8756-4910-ac25-dcecee99694a");
		
		return payments; 
	}
	
}
