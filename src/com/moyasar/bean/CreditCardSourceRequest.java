package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class CreditCardSourceRequest extends SourceRequest {
	
	public CreditCardSourceRequest(String name, String number, int cvc, int month, int year)
	{
		this.setType("creditcard");
		this.setName(name);
		this.setNumber(number);
		this.setCvc(cvc);
		this.setMonth(month);
		this.setYear(year);
	}
	
	public CreditCardSourceRequest()
	{
		this.setType("creditcard");
//		this.name = "";
//		this.number = "4111111111111111";
//		this.cvc = 0;
//		this.month = 1;
//		this.year = 2017;
	}
	
	@SerializedName("name")
	protected String name;
	
	@SerializedName( "number")
	protected String number;
	
	@SerializedName("cvc")
	protected int cvc;
	
	@SerializedName("month")
	protected int month;
	
	@SerializedName("year")
	protected int year;
	
	@SerializedName("3ds")
	protected boolean _3ds = true;
	
	public String getName()
	{
		return name;
	}
	
	public CreditCardSourceRequest setName(String name)
	{
		if(name.isEmpty()) throw new IllegalArgumentException("Name can't be empty!");
		
		this.name = name;
		
		return this;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public CreditCardSourceRequest setNumber(String number)
	{
		if(number.isEmpty()) throw new IllegalArgumentException("Credit card number can't be empty!");
		
		this.number = number;
		
		return this;
	}
	
	public int getCvc()
	{
		return cvc;
	}
	
	public CreditCardSourceRequest setCvc(int cvc)
	{
		if(cvc < 0) throw new IllegalArgumentException("CVC can't be negative!");
		
		this.cvc = cvc;
		
		return this;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public CreditCardSourceRequest setMonth(int month)
	{
		if(month < 0 || month > 12) throw new IllegalArgumentException("Month can't be negative or above 12!");
		this.month = month;
		
		return this;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public CreditCardSourceRequest setYear(int year)
	{
		if(year < 2017) throw new IllegalArgumentException("Year can't Be in the past!");
		this.year = year;
		
		return this;
	}
	
	public boolean get3DS()
	{
		return _3ds;
	}
	
	public CreditCardSourceRequest set3DS(boolean _3ds)
	{
		this._3ds = _3ds;
		
		return this;
	}
	
}
