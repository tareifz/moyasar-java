package com.moyasar.test;

import java.util.List;

import com.moyasar.bean.*;
import com.moyasar.main.*;

public class HelloMoyasar {

	
	
	
	public static void main(String[] args) {
		System.out.println("STARTING MOYASAR JAVA API TESTING \n\n");
		
		
		Moyasar moyasar = new Moyasar("sk_test_Fb7YSFW7rMJEiKpjdfYEs5zTfwQnnWzxsnsgthka");
		
//		System.out.println("======== Make Payment ========");
//		CreditCardSourceRequest sqr = new CreditCardSourceRequest("Abdulaziz Nasser", "4111111111111111", 331, 12, 2030);
//		PaymentRequestBean payment = new PaymentRequestBean(7000, "SAR", "Testing Java API Wrapprer for Moyasar", sqr, "http://moyasar.com");
//		System.out.println(moyasar.Payment.create(payment));
//		System.out.println("======== End Make Payment ========");
//		System.out.println("======== Get Payment 0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0 ========");
//		System.out.println(moyasar.Payment.find("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0").toString());
//		System.out.println("======== End Get Payment 0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0 ========");
//		System.out.println("======== Get All Payments ========");
//		System.out.println(moyasar.Payment.list(2).toString());
//		System.out.println("======== End Get All Payments ========");
//		System.out.println("======== Update Payment ========");
//		System.out.println(moyasar.Payment.find("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0").toString());
//		System.out.println("Updated: " + moyasar.Payment.update("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0", "new description after testing the update API"));
//		System.out.println(moyasar.Payment.find("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0").toString());
//		System.out.println("======== End Update Payment ========");
//		System.out.println("======== Refund Payment ========");
//		System.out.println(moyasar.Payment.find("81d26758-694f-4d02-95fd-5cdb25db58c5").toString());
//		System.out.println(moyasar.Payment.refund("81d26758-694f-4d02-95fd-5cdb25db58c5").toString());   // Tested and works correctly.
//		System.out.println(moyasar.Payment.find("3fa5f219-2fcb-404e-9567-61fba3af7efe").toString());
//		System.out.println(moyasar.Payment.refund("3fa5f219-2fcb-404e-9567-61fba3af7efe", 5000).toString());
//		System.out.println("======== End Refund Payment ========");
//		System.out.println("======== Create Invoice ========");
//		System.out.println(moyasar.Invoice.create(new InvoiceRequestBean(15000, "SAR", "Test Java Create Invoice.")).toString());
//		System.out.println("======== End Create Invoice ========");
//		System.out.println("======== Get Invoice ========");
//		System.out.println(moyasar.Invoice.find("7a7080ad-9856-4fd4-82d5-6067f54d40f7").toString());
//		System.out.println("======== End Get Invoice ========");
//		System.out.println("======== Update Invoice ========");
//		System.out.println(moyasar.Invoice.update("7a7080ad-9856-4fd4-82d5-6067f54d40f7", new InvoiceUpdateRequestBean(349876, null, null)).toString());
//		System.out.println("======== End Update Invoice ========");
//		System.out.println("======== Cancel Invoice ========");
//		System.out.println(moyasar.Invoice.cancel("7a7080ad-9856-4fd4-82d5-6067f54d40f7").toString());
//		System.out.println("======== End Cancel Invoice ========");
//		System.out.println("======== List Invoices ========");
//		System.out.println(moyasar.Invoice.list(1).toString());
//		System.out.println("======== End List Invoices ========");
		
		
		
//		Moyasar moyasar = new Moyasar("Your API Key");
		
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getErrorType());
//		System.out.println(response.getMessage());
//		System.out.println(response.getErrors());

//		// public SadadSourceRequest(String username, String success_url, String fail_url)
//		SadadSourceRequest ssr = new SadadSourceRequest("username", "https://moyasar.com/", "http://moyasar.com/404");
//
//		// or ..
//		SadadSourceRequest ssr2 = new SadadSourceRequest();
//				.setUsername("username")
//				.setSuccessUrl("https://moyasar.com/")
//				.setFailUrl("http://moyasar.com/404");
//
//		// public CreditCardSourceRequest(String name, String number, int cvc, int month, int year)
//		CreditCardSourceRequest ccsr = new CreditCardSourceRequest("Abdulaziz Nasser", "4111111111111111", 331, 12, 2030);
//
//		// or you can use method chaining ..
//		CreditCardSourceRequest ccsr2 = new CreditCardSourceRequest()
//				.setName("Abdulaziz Nasser")
////				.setNumber("4111111111111111")
////				.setCvc(331)
//				.setMonth(12)
//				.setYear(2030);
//
//		// public PaymentRequestBean(int amount, String currency, String description, SourceRequest source, String callbackUrl)
//		PaymentRequestBean payment = new PaymentRequestBean(7000, "SAR", "Testing Java API Wrapprer for Moyasar", ccsr2, "http://moyasar.com");
		
//
//		// or you can use method chaining ..
//		PaymentRequestBean payment2 = new PaymentRequestBean()
//				.setAmount(7000)
////				.setCurrency("SAR")
////				.setDescription("Testing Java API Wrapprer for Moyasar")
//				.setSource(ccsr2)
//				.setCallbackUrl("https://moyasar.com");
//
//		PaymentResponseBean response = moyasar.Payment.create(payment2);
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getErrorType());
//		System.out.println(response.getMessage());
//		System.out.println(response.getErrors());
		
//		response.getAmount();
//		response.getAmountFormat();
//		response.getCurrency();
//		response.getDescription();
//		response.getCallbackUrl();
//		response.getCreatedOn();
//		response.getFee();
//		response.getFeeFormat();
//		response.getId();
//		response.getInvoiceID();
//		response.getIp();
//		response.getRefunded();
//		response.getRefunded_at();
//		response.getRefundedFormat();
//		response.getStatusCode();
//		response.getUpdatedON();
//		response.getStatus(); // if >= 200 && < 300 then the request is successful
//		response.getSource().getType();
//		response.getSource().getCompany();
//		response.getSource().getName();
//		response.getSource().getNumber();
//		response.getSource().getMessage();
//		response.getSource().getTransactionURL();
		
//		PaymentResponseBean response = moyasar.Payment.find("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0");
//		PaymentResponseBean response = moyasar.Payment.fetch("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0");
		
		
		
//		// refund the whole payment.
//		PaymentResponseBean response = moyasar.Payment
//							.refund("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0");
		
//		
//		// refund some amount
//		PaymentResponseBean response = moyasar.Payment
//							.refund("0e62d86f-c2e0-4e4f-9881-bcdb9c6689a0", 1000);
		
		// public PaymentsResponseBean list(int page)
//		PaymentsResponseBean response = moyasar.Payment.list(1);

//		
//		// will return a Java List of PaymentResponseBean
//		List<PaymentResponseBean> list = rs.getPayments();
//		rs.getMeta().getCurrentPage();
//		rs.getMeta().getTotalCount();
//		rs.getMeta().getTotalPages();
//		rs.getMeta().getNextPage();
//		rs.getMeta().getPrevPage();
		
		
		// public InvoiceRequestBean(int amount, String currency,
		//					String description, String callbackUrl)
//		InvoiceRequestBean inv = new InvoiceRequestBean(15000, "SAR",
//							"Test Java Create Invoice.", "https://moyasar.com");
//		
//		// or ..
//		InvoiceRequestBean inv2 = new InvoiceRequestBean(15000, "SAR",
//							"Test Java Create Invoice.");
//		
//		// you can use method chaining ..
//		InvoiceRequestBean inv3 = new InvoiceRequestBean()
//									.setAmount(15000)
//									.setCurrency("SAR")
//									.setDescription("Example.")
//									.setCallbackUrl("https://moyasar.com/");
//		
//		InvoiceResponseBean res = moyasar.Invoice.create(inv3);

//		System.out.println(res.getStatusCode());
		
//		res.getStatusCode(); // if >= 200 && < 300 then the request is successful
//		res.getId();
//		res.getStatus();
//		res.getAmount();
//		res.getCurrency();
//		res.getDescription();
//		res.getLogoUrl();
//		res.getAmountFormat();
//		res.getUrl();
//		res.getCreatedAt();
//		res.getUpdatedAt();
//		res.getCallbackUrl();
		
//		InvoiceResponseBean res = moyasar.Invoice.find("7a7080ad-9856-4fd4-82d5-6067f54d40f7");
	
		
//		// public InvoiceUpdateRequestBean(int amount, String currency,
//		//							  String description, String callbackUrl)
//		InvoiceUpdateRequestBean invUp = new InvoiceUpdateRequestBean(23422, null, null, null);
//		
//		// or ..
//		InvoiceUpdateRequestBean invUp2 = new InvoiceUpdateRequestBean(23422, null, null);
//		
//		// method chaining ..
//		InvoiceUpdateRequestBean invUp3 = new InvoiceUpdateRequestBean()
//											.setAmount(12341)
//											.setDescription("new description");
//		
//		moyasar.Invoice.update("8899b84c-1136-4ccf-b6c1-2ead175c731e", invUp3);
		
		
//		InvoiceResponseBean res = moyasar.Invoice.cancel("8e12c6af-079f-4229-9b60-8e16682bb4ef");
		
//		System.out.println(res);
		
//		InvoicesResponseBean res = moyasar.Invoice.list(2);

//		
//		// will return a Java List of InvoiceResponseBean
//		List<InvoiceResponseBean> list = res.getInvoices();
//		res.getMeta().getCurrentPage();
//		res.getMeta().getTotalCount();
//		res.getMeta().getTotalPages();
//		res.getMeta().getNextPage();
//		res.getMeta().getPrevPage();
		
//		CreditCardSourceRequest ccsr2 = new CreditCardSourceRequest()
//				.setName("Abdulaziz Nasser")
////				.setNumber("4111111111111111")
////				.setCvc(331)
//				.setMonth(12)
//				.setYear(2030);
//		PaymentRequestBean payment = new PaymentRequestBean(7000, "SAR", "Testing Java API Wrapprer for Moyasar", ccsr2, "http://moyasar.com");
//		
//		try {
//			moyasar.Payment.create(payment);
//		} catch (MoyasarException e) {
//			System.out.println(e.getStatusCode());
//			System.out.println(e.getMessage());
//			System.out.println(e.getErrorType());
//			System.out.println(e.getErrors());
//		}
		
		System.out.println("THE END OF MOYASAR JAVA API TESTING \n\n");
		
	}
	
}
