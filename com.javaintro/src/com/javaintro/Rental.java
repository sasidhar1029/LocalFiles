//**Batch 61 Assignment*:
//*Java**
//ZoomCar Rentals requires a Java program to compute rental charges for customers.
//The program should be able to:
//Return the name of the company as a text value.
//Provide the fixed daily rental rate, which is ₹1500.
//Calculate the base rental cost based on the number of days rented.
//Return a fixed insurance fee of ₹500.
//Calculate the total cost by combining the base rental cost and the insurance fee.
//Return a welcome message for customers., *Take Each Requirement in separate method*
//

package com.javaintro;

public class Rental {
//     private static int days;

	static String getCompanyName() {
    	 return "audi";
     }
     static int rentRate() {
    	return 1500; 
     }
     static int calculateRenDays(int days) {
    	 return rentRate()*days;
     }
     static int fixedInsurence() {
    	 return 500;
     }
   
     static int totalCost(int days) {
    
		return calculateRenDays(days)+fixedInsurence();
     }
     static String welcome() {
    	 return "Take Each Requirement in separate method*";
     }
	
	public static void main(String[] args) {
		
		System.out.println(getCompanyName());
		System.out.println(rentRate());
		System.out.println(calculateRenDays(10));
		System.out.println(fixedInsurence());
		System.out.println(totalCost(3));
		System.out.println(welcome());

	}

}
