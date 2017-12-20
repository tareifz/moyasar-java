package com.moyasar.main;

import com.moyasar.bean.InvoiceRequestBean;
import com.moyasar.bean.InvoiceResponseBean;
import com.moyasar.bean.InvoiceUpdateRequestBean;
import com.moyasar.bean.InvoicesResponseBean;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoyasarInvoiceService {
	
	public static final String url_const = "/v1";
	
	// #######################################################
	// ################ 	 	Invoices		##############
	// #######################################################
		
	@Headers({"Content-Type: application/json"})
	@POST(url_const + "/invoices")
	public retrofit2.Call<InvoiceResponseBean> create(@Header("Authorization") String key, @Body InvoiceRequestBean invoice);
		
	@Headers({"Content-Type: application/json"})
	@GET(url_const + "/invoices/{id}")
	public retrofit2.Call<InvoiceResponseBean> find(@Header("Authorization") String key, @Path("id") String id);
	
	@Headers({"Content-Type: application/json"})
	@GET(url_const + "/invoices/{id}")
	public retrofit2.Call<InvoiceResponseBean> fetch(@Header("Authorization") String key, @Path("id") String id);
	
	@Headers({"Content-Type: application/json"})
	@PUT(url_const + "/invoices/{id}")
	public retrofit2.Call<InvoiceResponseBean> update(@Header("Authorization") String key, @Path("id") String id, @Body InvoiceUpdateRequestBean invoice);
	
	@Headers({"Content-Type: application/json"})
	@PUT(url_const + "/invoices/{id}/cancel")
	public retrofit2.Call<InvoiceResponseBean> cancel(@Header("Authorization") String key, @Path("id") String id);
	
	@Headers({"Content-Type: application/json"})
	@GET(url_const + "/invoices/")
	public retrofit2.Call<InvoicesResponseBean> list(@Header("Authorization") String key, @Query("page") int page);

}
