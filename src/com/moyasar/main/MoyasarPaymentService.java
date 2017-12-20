package com.moyasar.main;


import com.moyasar.bean.PaymentRequestBean;
import com.moyasar.bean.PaymentResponseBean;
import com.moyasar.bean.PaymentsResponseBean;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface MoyasarPaymentService {
	
	public static final String url_const = "/v1";
	
	// #######################################################
	// ################ 	 	Payments		##############
	// #######################################################
	
	@Headers({"Content-Type: application/json"})
	@POST(url_const + "/payments")
	public retrofit2.Call<PaymentResponseBean> create(@Header("Authorization") String key, @Body PaymentRequestBean payment);
	
	@Headers({"Content-Type: application/json"})
	@GET(url_const + "/payments/{id}")
	public retrofit2.Call<PaymentResponseBean> find(@Header("Authorization") String key, @Path("id") String id);
	
	@Headers({"Content-Type: application/json"})
	@POST(url_const + "/payments/{id}/refund")
	public retrofit2.Call<PaymentResponseBean> refund(@Header("Authorization") String key, @Path("id") String id);
	
	@Headers({"Content-Type: application/json"})
	@POST(url_const + "/payments/{id}/refund")
	public retrofit2.Call<PaymentResponseBean> refund(@Header("Authorization") String key, @Path("id") String id, @Query("amount") int amount);
	
	@Headers({"Content-Type: application/json"})
	@GET(url_const + "/payments")
	public retrofit2.Call<PaymentsResponseBean> list(@Header("Authorization") String key, @Query("page") int page);
	
	@Headers({"Content-Type: application/json"})
	@PUT(url_const + "/payments/{id}")
	public retrofit2.Call<ResponseBody> update(@Header("Authorization") String key, @Path("id") String id, @Query("description") String desc);
	
	
	
}
