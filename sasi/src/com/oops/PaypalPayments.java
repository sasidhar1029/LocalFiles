package com.oops;

public class PaypalPayments implements PaymentStrategy {
     private String email;
	 public PaypalPayments(String email) {
		 this.email =email;
	 }
	 
	 @Override
	 public void pay(double amount) {
		 System.out.println("paid"+amount+"using paypal:"+email);
	 }
	 

}
