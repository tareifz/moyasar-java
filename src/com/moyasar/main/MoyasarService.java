package com.moyasar.main;


import com.moyasar.bean.PaymentRequestBean;
import com.moyasar.bean.PaymentResponseBean;
import com.moyasar.bean.PaymentsResponseBean;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface MoyasarService {
	
	public static final String url_const = "/v1";
	
	@Headers({"Content-Type: application/json"})
	@GET(url_const + "/payments")
	public retrofit2.Call<PaymentsResponseBean> getPayments(@Header("Authorization") String key);
	
	@Headers({"Content-Type: application/json"})
	@GET(url_const + "/payments/{id}")
	public retrofit2.Call<PaymentResponseBean> getPayment(@Header("Authorization") String key,@Path("id")String id);
	
	
	@Headers({"Content-Type: application/json"})
	@POST(url_const + "/payments")
	public retrofit2.Call<PaymentResponseBean> pay(@Header("Authorization") String key, @Body PaymentRequestBean payment);
	
}
