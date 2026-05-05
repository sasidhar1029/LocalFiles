package com.oops;

public class UpiPayments implements PaymentStrategy {
     private String upiId;
	 public UpiPayments(String upiId) {
		 this.upiId =upiId;
	 }
	 
	 @Override
	 public void pay(double amount) {
		 System.out.println("paid"+amount+"using upi:"+upiId);
	 }
	 

}
