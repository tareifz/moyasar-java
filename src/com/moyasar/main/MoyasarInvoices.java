package com.moyasar.main;

import java.net.SocketTimeoutException;
import java.util.Base64;

import com.moyasar.bean.ErrorsBean;
import com.moyasar.bean.InvoiceRequestBean;
import com.moyasar.bean.InvoiceResponseBean;
import com.moyasar.bean.InvoiceUpdateRequestBean;
import com.moyasar.bean.InvoicesResponseBean;

import retrofit2.Call;
import retrofit2.Response;

public class MoyasarInvoices {

	private String privateKey;

	// ###############################################
	//					Invoices
	// ###############################################

	public InvoiceResponseBean create(InvoiceRequestBean invoice)
	{
		InvoiceResponseBean myInvoice = new InvoiceResponseBean();
		try
		{

			MoyasarInvoiceService service = Moyasar.caller.create(MoyasarInvoiceService.class);

			Call<InvoiceResponseBean> call = service.create(getPrivateKey(), invoice);

			Response<InvoiceResponseBean> response = call.execute(); 
			if (response.isSuccessful())
			{
				// 200 OK 
				myInvoice = response.body();
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(response.message());
			}
			else
			{
				// API error  
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(errors.getMessage());
				myInvoice.setErrorType(errors.getType());
				myInvoice.setErrors(errors.getErrors());
			}

		}
		catch(SocketTimeoutException tm)
		{
			System.err.println("API END POINT TIMED OUT");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return myInvoice; 

	}

	public InvoiceResponseBean find(String id)
	{
		InvoiceResponseBean myInvoice = new InvoiceResponseBean();

		try
		{
			if (id.isEmpty())
			{
				myInvoice.setStatusCode(412);
				myInvoice.setErrorType("client_error");
				myInvoice.setMessage("Precondition Failed: Invoice ID Cannot be Empty or Null");

				throw new IllegalArgumentException("Invoice ID Cannot be Empty or Null");
			}

			MoyasarInvoiceService service = Moyasar.caller.create(MoyasarInvoiceService.class);
			Call<InvoiceResponseBean> call = service.find(getPrivateKey(), id);
			Response<InvoiceResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				myInvoice = response.body();
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(response.message());
			}
			else
			{
				// API error  
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(errors.getMessage());
				myInvoice.setErrorType(errors.getType());
				myInvoice.setErrors(errors.getErrors());
			}
		}
		catch(SocketTimeoutException tm)
		{
			System.err.println("API END POINT TIMED OUT");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return myInvoice;
	}

	public InvoiceResponseBean fetch(String id)
	{
		return find(id);
	}

	public InvoiceResponseBean update(String id, InvoiceUpdateRequestBean req)
	{
		InvoiceResponseBean myInvoice = new InvoiceResponseBean();

		try
		{
			if (id.isEmpty())
			{
				myInvoice.setStatusCode(412);
				myInvoice.setErrorType("client_error");
				myInvoice.setMessage("Precondition Failed: Invoice ID Cannot be Empty or Null");

				throw new IllegalArgumentException("Invoice ID Cannot be Empty or Null");
			}

			MoyasarInvoiceService service = Moyasar.caller.create(MoyasarInvoiceService.class);
			Call<InvoiceResponseBean> call = service.update(getPrivateKey(), id, req);
			Response<InvoiceResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				myInvoice = response.body();
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(response.message());
			}
			else
			{
				// API error  
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(errors.getMessage());
				myInvoice.setErrorType(errors.getType());
				myInvoice.setErrors(errors.getErrors());
			}
		}
		catch(SocketTimeoutException tm)
		{
			System.err.println("API END POINT TIMED OUT");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return myInvoice;
	}

	public InvoiceResponseBean cancel(String id)
	{
		InvoiceResponseBean myInvoice = new InvoiceResponseBean();

		try
		{
			if (id.isEmpty())
			{
				myInvoice.setStatusCode(412);
				myInvoice.setErrorType("client_error");
				myInvoice.setMessage("Precondition Failed: Invoice ID Cannot be Empty or Null");

				throw new IllegalArgumentException("Invoice ID Cannot be Empty or Null");
			}

			MoyasarInvoiceService service = Moyasar.caller.create(MoyasarInvoiceService.class);
			Call<InvoiceResponseBean> call = service.cancel(getPrivateKey(), id);
			Response<InvoiceResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				myInvoice = response.body();
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(response.message());
			}
			else
			{
				// API error  
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myInvoice.setStatusCode(response.code());
				myInvoice.setMessage(errors.getMessage());
				myInvoice.setErrorType(errors.getType());
				myInvoice.setErrors(errors.getErrors());
			}
		}
		catch(SocketTimeoutException tm)
		{
			System.err.println("API END POINT TIMED OUT");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return myInvoice;
	}
	
	public InvoicesResponseBean list(int page)
	{
		InvoicesResponseBean invoicesList = new InvoicesResponseBean(); 
		try
		{

			MoyasarInvoiceService service = Moyasar.caller.create(MoyasarInvoiceService.class);

			Call<InvoicesResponseBean> call = service.list(getPrivateKey(), page);

			Response<InvoicesResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				invoicesList = response.body();
				invoicesList.setStatusCode(response.code());
				invoicesList.setMessage(response.message());

			}
			else
			{
				// API error  
//				System.err.println("Errors ===> " + response.errorBody().string().toString());
//				invoicesList.setStatusCode(response.code());
//				invoicesList.setMessage(response.message());
//				invoicesList.setErrorType(response.errorBody().string().toString());
//				throw new IllegalAccessException(invoicesList.getStatusCode() + ": " + invoicesList.getMessage() + "\n" + invoicesList.getErrorType());
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				invoicesList.setStatusCode(response.code());
				invoicesList.setMessage(errors.getMessage());
				invoicesList.setErrorType(errors.getType());
				invoicesList.setErrors(errors.getErrors());
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return invoicesList; 
	}

	// ###############################################
	//					Helpers
	// ###############################################

	private String makeKey(String key)
	{ 
		// This method is to prepare the key to match the format "Basic KEY" 
		return "Basic "+Base64.getEncoder().encodeToString(key.getBytes());
	}

	public String getPrivateKey()
	{
		return privateKey;
	}

	public MoyasarInvoices setPrivateKey(String privateKey)
	{
		if (privateKey.isEmpty()) throw new IllegalArgumentException("Private Key Cannot be empty!");

		this.privateKey = makeKey(privateKey);

		return this;
	}
}
