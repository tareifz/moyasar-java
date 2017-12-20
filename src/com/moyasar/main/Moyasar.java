package com.moyasar.main;

import java.util.Base64;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Moyasar
{

	public static final String API_BASE_URL = "https://api.moyasar.com/";
	private String privateKey;
	protected static Retrofit caller;
	public MoyasarPayments Payment = new MoyasarPayments();
	public MoyasarInvoices Invoice = new MoyasarInvoices();

	public Moyasar(String privateKey)
	{
		this.setPrivateKey(privateKey);

		this.Payment.setPrivateKey(privateKey);

		this.Invoice.setPrivateKey(privateKey);

		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		// add your other interceptors …

		// add logging as last interceptor
		httpClient.addInterceptor(logging); // <-- this is the important line!
		caller  = new Retrofit.Builder()
				.baseUrl(API_BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.client(httpClient.build())
				.build();
	}

	public Moyasar enableLogging()
	{
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

		logging.setLevel(Level.BODY);
		httpClient.addInterceptor(logging);

		caller  = new Retrofit.Builder()
				.baseUrl(API_BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.client(httpClient.build())
				.build();

		return this;
	}

	public Retrofit getCaller()
	{
		return caller; 
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

	public Moyasar setPrivateKey(String privateKey)
	{
		if (privateKey.isEmpty()) throw new IllegalArgumentException("Private Key Cannot be empty!");

		this.privateKey = makeKey(privateKey);

		return this;
	}

}
