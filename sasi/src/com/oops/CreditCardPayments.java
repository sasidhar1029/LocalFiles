package com.oops;

public class CreditCardPayments implements PaymentStrategy {
     private String cardNumber;
	 public CreditCardPayments(String cardNumber) {
		 this.cardNumber =cardNumber;
	 }
	 
	 @Override
	 public void pay(double amount) {
		 System.out.println("paid"+amount+"using credit card:"+cardNumber);
	 }
	 

}
