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
		
//		System.out.println(sqr.toString());
		
		System.out.println("THE END OF MOYASAR JAVA API TESTING \n\n");
		
		System.out.println("STARTING MOYASAR JAVA API GET PAYMENTS TESTING \n\n");
		getPaymentTest();
		System.out.println("THE END OF MOYASAR JAVA API GET PAYMENTS TESTING \n\n");
		
	}
	
	
	public static PaymentResponseBean getPaymentTest()
	{
		MoyasarClient c = new MoyasarClient("sk_test_jv9XL2ot9WeWLF7UBE3xSJepzgfh8x6UYKBuCaWy", "sk_test_jv9XL2ot9WeWLF7UBE3xSJepzgfh8x6UYKBuCaWy", false);
		PaymentsResponseBean payments = null; 
		
		payments = c.getAllPayments();
		
		System.out.println("Pyaments in account = " + payments.getPayments().size());
		System.out.println("Message & CODE ERROR:  ===> " + payments.getMessage() + " & " + payments.getStatusCode());
		PaymentResponseBean paymentBean = new PaymentResponseBean(); 
		// Correct Test Paymnet ID: 2811a704-e7d7-4fc5-a2e3-3a37974dd96f
		paymentBean = c.getPayment("2811a704-e7d7-4fc5-a2e3-3a37974dd96f");
		System.out.println("FULL BEAN --> " + paymentBean);
		System.out.println("DESCRIPTION:  ===> " + paymentBean.getDescription());
		System.out.println("Message CODE ERROR:  ===> " + paymentBean.getMessage());
		return paymentBean; 
	}
	
}
