package com.moyasar.main;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Base64;

import com.moyasar.bean.ErrorsBean;
import com.moyasar.bean.PaymentRequestBean;
import com.moyasar.bean.PaymentResponseBean;
import com.moyasar.bean.PaymentsResponseBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

public class MoyasarPayments {

	private String privateKey;

	public PaymentResponseBean create(PaymentRequestBean payment)
	{
		PaymentResponseBean myPayment = new PaymentResponseBean();
		try
		{

			MoyasarPaymentService service = Moyasar.caller.create(MoyasarPaymentService.class);

			Call<PaymentResponseBean> call = service.create(getPrivateKey(), payment);

			Response<PaymentResponseBean> response = call.execute(); 
			if (response.isSuccessful())
			{
				// 200 OK 
				myPayment = response.body();
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(response.message());
			}
			else
			{
				// API error
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(errors.getMessage());
				myPayment.setErrorType(errors.getType());
				myPayment.setErrors(errors.getErrors());
			}


			/** Async. call it dose not fit the case.. 
			call.enqueue(new Callback<PaymentResponseBean>(){

				@Override
				public void onFailure(Call<PaymentResponseBean> payment, Throwable e) {
					System.out.println("Error Happend Payments Object: \n"+payment );
					e.printStackTrace();
				}

				@Override
				public void onResponse(Call<PaymentResponseBean> payment,
						Response<PaymentResponseBean> respons) {
					System.out.println("Response ---> \n"+ respons.body() );
//					System.out.println("Payments --> \n" + payment.toString()); 
					 if (respons.isSuccessful()){
						 // We got 200 OK
						 myPayment.setAmount(respons.body().getAmount());
						 myPayment.setDescription(respons.body().getDescription());
					 }else{
						 // WE GOT AN ERROR
					 }
				}


			}); **/

		}
		catch(SocketTimeoutException tm)
		{
			System.err.println("API END POINT TIMED OUT");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

		return myPayment; 

	}

	public PaymentResponseBean find(String id)
	{
		PaymentResponseBean myPayment = new PaymentResponseBean();

		try
		{
			if (id.isEmpty())
			{
				myPayment.setStatusCode(412);
				myPayment.setErrorType("client_error");
				myPayment.setMessage("Precondition Failed: Payment ID Cannot be Empty or Null");

				throw new IllegalArgumentException("Payment ID Cannot be Empty or Null");
			}

			MoyasarPaymentService service = Moyasar.caller.create(MoyasarPaymentService.class);
			Call<PaymentResponseBean> call = service.find(getPrivateKey(), id);
			Response<PaymentResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				myPayment = response.body();
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(response.message());
			}
			else
			{
				// API error  
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(errors.getMessage());
				myPayment.setErrorType(errors.getType());
				myPayment.setErrors(errors.getErrors());
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

		return myPayment;
	}

	public PaymentResponseBean fetch(String id)
	{
		return find(id);
	}


	//	public PaymentResponseBean getPayment(UUID paymentId){
	//		return null;
	//	}

	public PaymentResponseBean refund(String id)
	{
		PaymentResponseBean myPayment = new PaymentResponseBean();

		try
		{
			if (id.isEmpty())
			{
				myPayment.setStatusCode(412);
				myPayment.setErrorType("client_error");
				myPayment.setMessage("Precondition Failed: Payment ID Cannot be Empty or Null");

				throw new IllegalArgumentException("Payment ID Cannot be Empty or Null");
			}

			MoyasarPaymentService service = Moyasar.caller.create(MoyasarPaymentService.class);
			Call<PaymentResponseBean> call = service.refund(getPrivateKey(), id);
			Response<PaymentResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				myPayment = response.body();
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(response.message());
			}
			else
			{
				// API error  
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(errors.getMessage());
				myPayment.setErrorType(errors.getType());
				myPayment.setErrors(errors.getErrors());
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

		return myPayment;
	}

	public PaymentResponseBean refund(String id, int amount)
	{
		PaymentResponseBean myPayment = new PaymentResponseBean();

		try
		{
			if (id.isEmpty())
			{
				myPayment.setStatusCode(412);
				myPayment.setErrorType("client_error");
				myPayment.setMessage("Precondition Failed: Payment ID Cannot be Empty or Null");

				throw new IllegalArgumentException("Payment ID Cannot be Empty or Null");
			}

			MoyasarPaymentService service = Moyasar.caller.create(MoyasarPaymentService.class);
			Call<PaymentResponseBean> call = service.refund(getPrivateKey(), id, amount);
			Response<PaymentResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				myPayment = response.body();
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(response.message());
			}
			else
			{
				// API error  
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				myPayment.setStatusCode(response.code());
				myPayment.setMessage(errors.getMessage());
				myPayment.setErrorType(errors.getType());
				myPayment.setErrors(errors.getErrors());
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

		return myPayment;
	}

	public boolean update(String id, String desc)
	{
		MoyasarPaymentService service = Moyasar.caller.create(MoyasarPaymentService.class);
		Call<ResponseBody> call = service.update(getPrivateKey(),id, desc);

		try
		{
			Response<ResponseBody> response = call.execute();

			if(response.code() ==200)
				return true;
			else
				return false;

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * This Class will call Moyasar API to get all payment for this account. 
	 * As per the Moyasar Policy we should use Private key to get data. Therefore, we will use the private key to get the data. 
	 * @return ArrayList of Payments as an objects of PaymentResponse
	 */

	public PaymentsResponseBean list(int page)
	{
		PaymentsResponseBean paymentsList = new PaymentsResponseBean(); 
		try
		{

			MoyasarPaymentService service = Moyasar.caller.create(MoyasarPaymentService.class);

			Call<PaymentsResponseBean> call = service.list(getPrivateKey(), page);

			Response<PaymentsResponseBean> response = call.execute();

			if (response.isSuccessful())
			{
				// 200 OK 
				paymentsList = response.body();
				paymentsList.setStatusCode(response.code());
				paymentsList.setMessage(response.message());

			}
			else
			{
				// API error  
//				System.err.println("Errors ===> " + response.errorBody().string().toString());
//				paymentsList.setStatusCode(response.code());
//				paymentsList.setMessage(response.message());
//				paymentsList.setErrorType(response.errorBody().string().toString());
//				throw new IllegalAccessException(paymentsList.getStatusCode() + ": " + paymentsList.getMessage() + "\n" + paymentsList.getErrorType());
				ErrorsBean errors = new ErrorsBean(response.errorBody().string());
				paymentsList.setStatusCode(response.code());
				paymentsList.setMessage(errors.getMessage());
				paymentsList.setErrorType(errors.getType());
				paymentsList.setErrors(errors.getErrors());
			}

			/** The below is ASYNC call which we will support in feature not now!  
			call.enqueue(new Callback<PaymentsResponseBean>(){

				@Override
				public void onFailure(Call<PaymentsResponseBean> payments, Throwable e) {
					System.out.println("Error Happend Payments Object: \n"+payments );
					e.printStackTrace();
				}

				@Override
				public void onResponse(Call<PaymentsResponseBean> payments,
						Response<PaymentsResponseBean> respons) {
					System.out.println("Response ---> \n"+ respons.body() );
					System.out.println("Payments --> \n" + payments.toString());

				}

			});**/

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return paymentsList; 
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

	public MoyasarPayments setPrivateKey(String privateKey)
	{
		if (privateKey.isEmpty()) throw new IllegalArgumentException("Private Key Cannot be empty!");

		this.privateKey = makeKey(privateKey);

		return this;
	}
}
