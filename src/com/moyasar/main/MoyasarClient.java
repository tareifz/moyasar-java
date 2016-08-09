package com.moyasar.main;

import java.util.UUID;

import com.moyasar.bean.PaymentRequestBean;
import com.moyasar.bean.PaymentResponseBean;
import com.moyasar.bean.PaymentsResponseBean;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MoyasarClient {
	
	public static final String API_BASE_URL = "https://api.moyasar.com/v1/";
	private String publicKey; 
	private String privateKey;
	private Retrofit caller;
//	private OkHttpClient client;
	
	
	
	
	private MoyasarClient(){
		// setting up Retrofit 
		 caller  = new Retrofit.Builder()
				.baseUrl(API_BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();
	}
	
	
	public MoyasarClient(String publicKey, String privateKey) {
		setPublicKey(publicKey);
		setPrivateKey(privateKey);
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();  
		// set your desired log level
		logging.setLevel(Level.BODY);

		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();  
		// add your other interceptors …

		// add logging as last interceptor
		httpClient.addInterceptor(logging); // <-- this is the important line!
		caller  = new Retrofit.Builder()
				.baseUrl("https://api.moyasar.com/v1/")
				.addConverterFactory(GsonConverterFactory.create())
				.client(httpClient.build())
				.build();
//		 client = new OkHttpClient();
	}
	
	
	


	public PaymentResponseBean makePayment(PaymentRequestBean payment){
		return null;
	}
	
	
	public PaymentResponseBean getPayment(UUID paymentId){
		return null;
	}
	
	/**
	 * This Class will call Moyasar API to get all payment for this account. 
	 * As per the Moyasar Policy we should use Private key to get data. Therefore, we will use the private key to get the data. 
	 * @return ArrayList of Payments as an objects of PaymentResponse
	 */

	public PaymentsResponseBean getAllPayments(){
		System.out.println("Before Try Block");
		try{
			System.out.println("In method 1 ");
			MoyasarService service = caller.create(MoyasarService.class);
			System.out.println("In method 2 ");
			Call<PaymentsResponseBean> call = service.getPayments();
			System.out.println("In method 3 ");
			call.enqueue(new Callback<PaymentsResponseBean>(){

				@Override
				public void onFailure(Call<PaymentsResponseBean> payments, Throwable e) {
					System.out.println("Erro Happend Payments Object: \n"+payments );
					e.printStackTrace();
				}

				@Override
				public void onResponse(Call<PaymentsResponseBean> payments,
						Response<PaymentsResponseBean> respons) {
					System.out.println("Response ---> \n"+ respons.body() );
					System.out.println("Payments --> \n" + payments.toString());
					
				}
				
			});
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null; 
	}

	
	public PaymentResponseBean getPayment(String id){
		System.out.printf("Before Try Block getPayment and the ID IS: %s", id);
		try{
			System.out.println("\n In method 1 ");
			MoyasarService service = caller.create(MoyasarService.class);
			System.out.println("In method 2 ");
			Call<PaymentResponseBean> call = service.getPayment(getPrivateKey(),id);
			System.out.println("In method 3 ");
			call.enqueue(new Callback<PaymentResponseBean>(){

				@Override
				public void onFailure(Call<PaymentResponseBean> payment, Throwable e) {
					System.out.println("Erro Happend Payments Object: \n"+payment );
					e.printStackTrace();
				}

				@Override
				public void onResponse(Call<PaymentResponseBean> payment,
						Response<PaymentResponseBean> respons) {
					System.out.println("Response ---> \n"+ respons.body() );
					System.out.println("Payments --> \n" + payment.toString());
					
				}

				
			});
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null; 
	}
	
	
	private String makeKey(String key){ 
		// This method is to prepare the key to match the format "Basic KEY"
		return "Basic "+key;
	}
	
	
	public void setPublicKey(String publicKey){
		try{
			if (!publicKey.isEmpty()){
				this.publicKey = makeKey(publicKey);
			}
			else
				throw new IllegalArgumentException("Public Key Cannot be empty!"); 
		}catch (Exception e) {
			throw new IllegalArgumentException("Public Key Cannot be empty!");
		} 
	}

	public String getPublicKey() {
		return publicKey;
	}



	public String getPrivateKey() {
		return privateKey;
	}


	public void setPrivateKey(String privateKey) {
		try{
			if (!privateKey.isEmpty()){
				this.privateKey = makeKey(privateKey);
			}
			else
				throw new IllegalArgumentException("Private Key Cannot be empty!"); 
		}catch (Exception e) {
			throw new IllegalArgumentException("Private Key Cannot be empty!");
		} 
	}
	

}
