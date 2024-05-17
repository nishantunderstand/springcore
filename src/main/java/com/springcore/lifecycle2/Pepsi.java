package com.springcore.lifecycle2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	

	public void afterPropertiesSet() throws Exception {
		
		//init Functionality
		System.out.println("Taking Pepsit : init method");
		
	}

	public void destroy() throws Exception {
		
		//destroy method
		System.out.println("Going to Bottle Back to Shop : destroy method");
		
	}
	
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

}
