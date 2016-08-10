package com.moyasar.test;

import com.moyasar.bean.PaymentResponseBean;
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
		MoyasarClient c = new MoyasarClient("sk_test_jv9XL2ot9WeWLF7UBE3xSJepzgfh8x6UYKBuCaWy", "sk_test_jv9XL2ot9WeWLF7UBE3xSJepzgfh8x6UYKBuCaWy");
		PaymentsResponseBean payments = null; 
		
		payments = c.getAllPayments();
		
		System.out.println("Pyaments in account = " + payments.getPayments().size());
		
		PaymentResponseBean paymentBean = new PaymentResponseBean(); 
		paymentBean = c.getPayment("2811a704-e7d7-4fc5-a2e3-3a37974dd9");
		System.out.println("DESCRIPTION:  ===> " + paymentBean.getDescription());
		
		return payments; 
	}
	
}
