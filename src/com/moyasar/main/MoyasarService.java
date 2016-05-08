package com.moyasar.main;

import java.util.ArrayList;

import com.moyasar.bean.PaymentsResponseBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface MoyasarService {

	@Headers({"Authorization: Basic TXJ0d296TEpBdUZtTEtXV1NhUmFvYUxYOg==","Content-Type: application/json"})
	@GET("https://api.moyasar.com/v1/payments")
	public Call<PaymentsResponseBean> getPayments();
	
	
}
