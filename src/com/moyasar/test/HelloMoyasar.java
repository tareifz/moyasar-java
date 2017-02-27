package com.moyasar.test;

import com.moyasar.bean.PaymentRequestBean;
import com.moyasar.bean.PaymentResponseBean;
import com.moyasar.bean.PaymentsResponseBean;
import com.moyasar.bean.SadadPaymentRequestBean;
import com.moyasar.bean.SourceRequest;
import com.moyasar.main.MoyasarClient;

public class HelloMoyasar {

	
	
	
	public static void main(String[] args) {
//		SourceRequest sqr = new SourceRequest();
//		sqr.setUsername("u3041555Xolp");
//		sqr.setFailUrl("https://dashboard.stg.moyasar.com/sadad/fail");
//		sqr.setSuccessUrl("https://dashboard.stg.moyasar.com/sadad/success");
//		sqr.setType("sadad");
//		
//		PaymentRequestBean payment = new PaymentRequestBean();
//		payment.setAmount(199);
//		payment.setSource(sqr);
//		payment.setCurrency("SAR");
//		payment.setDescription("Testing Java API Wrapprer for Moyasar");
//			
		System.out.println("STARTING MOYASAR JAVA API TESTING \n\n");
//		
//		System.out.println(sqr.toString());
//		makePayment(payment);
		
		makeCCPayment();
		
		System.out.println("THE END OF MOYASAR JAVA API TESTING \n\n");
//		
//		System.out.println("STARTING MOYASAR JAVA API GET PAYMENTS TESTING \n\n");
////		getPaymentTest();
//		System.out.println("THE END OF MOYASAR JAVA API GET PAYMENTS TESTING \n\n");
		
	}
	
	
	private static void makeCCPayment() {
		// TODO Auto-generated method stub
		SourceRequest sqr = new SourceRequest();
		sqr.setName("Basem Aljedai");
		sqr.setCvc("256");
		sqr.setNumber("41111111111111");
		sqr.setMonth("11");
		sqr.setYear("2020");
		sqr.setType("creditcard");
		
		PaymentRequestBean payment = new PaymentRequestBean();
		payment.setAmount(30000);
		payment.setSource(sqr);
		payment.setCurrency("SAR");
		payment.setDescription("Testing Java API Wrapprer for Moyasar");
		
		
		MoyasarClient c = new MoyasarClient("pk_test_oVV2yBq9HyoPKTEgFr6sNkoxLip2cwLSr7oa94SR", "sk_test_GoHLPmrFVEWmmzSwZgk3Qbqf5WUjHMg6sv6R8NaX", true);
		PaymentResponseBean response = c.makePayment(payment);
		
		System.out.println("PAYMENT STATUS: " + response.getSource().getMessage());
		
		
	}


	private static void makePayment(PaymentRequestBean payment) {
		MoyasarClient c = new MoyasarClient("pk_test_oVV2yBq9HyoPKTEgFr6sNkoxLip2cwLSr7oa94SR", "sk_test_GoHLPmrFVEWmmzSwZgk3Qbqf5WUjHMg6sv6R8NaX", false);
		PaymentResponseBean response = c.makePayment(payment);
		
		System.out.println(response.getSource().getTransactionURL());
	}


	public static PaymentResponseBean getPaymentTest()
	{
		MoyasarClient c = new MoyasarClient("sk_test_aP2CpcyUwBqpDhqok2wAq33u5gwtQ8nPtH9iS28h", "sk_test_aP2CpcyUwBqpDhqok2wAq33u5gwtQ8nPtH9iS28h", false);
//		MoyasarClient c = new MoyasarClient("pk_test_b7p4Zt9iPBouTDPNuuV44k7RVGoiF6aNFZfg4ksK", "sk_test_7LoSc97oRM9rfnL8ac7hLhnxwC9hxwzkxoQMPu23", false);
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
