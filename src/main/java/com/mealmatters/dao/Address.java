package com.mealmatters.dao;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String street;
	private String city;
	private String postal_code;
	public Address(String street, String city, String postal_code) {
		super();
		this.street = street;
		this.city = city;
		this.postal_code = postal_code;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	

}
