package com.moyasar.main;


import com.moyasar.bean.PaymentResponseBean;
import com.moyasar.bean.PaymentsResponseBean;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;


public interface MoyasarService {

	@Headers({"Authorization: Basic TXJ0d296TEpBdUZtTEtXV1NhUmFvYUxYOg==","Content-Type: application/json"})
	@GET("https://api.moyasar.com/v1/payments")
	public retrofit2.Call<PaymentsResponseBean> getPayments();
	
	@Headers({"Content-Type: application/json"})
	@GET("https://api.moyasar.com/v1/payments/{id}")
	public retrofit2.Call<PaymentResponseBean> getPayment(@Header("Authorization") String key,@Path("id")String id);
	
	
}
