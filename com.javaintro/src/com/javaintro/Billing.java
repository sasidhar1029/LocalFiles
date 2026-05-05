//A small local grocery store uses a simple biling system developed in Java. 

//The store sells three products;
//a. Rice (र45/kg)
//b. Sugar (र40/kg)
//c, Oil(र130litre)
//The shopkeeper wants a program where he can enter the quantity (in kg or litre) of 
//each item bought by the customer, and the system should;
//1. Calculate the total cost for each item
//2. Calculate the final bill amount
//3. Calculate how much change to return if the customer gives money

package com.javaintro;
import java.util.Scanner;
public class Billing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ricePrice= 45;
		int sugarPrice = 40;
		int oilPrice = 130;
		
         int riceQty = sc.nextInt();
         int sugarQty = sc.nextInt();
         int oilQty = sc.nextInt();
         
         int riceTotal = ricePrice*riceQty;
         int sugarTotal = sugarPrice*sugarQty;
         int oilTotal = oilPrice*oilQty;
         
         int TotalPrice = riceTotal+sugarTotal+oilTotal;
         System.out.println("--------Bill--------");
         System.out.println("Rice:"+riceTotal);
         System.out.println("sugar:"+sugarTotal);
         System.out.println("oil:"+oilTotal);
         System.out.println("Total Bill:"+TotalPrice);
         
         System.out.println("Enter amount given by customer");
         int amountGiven = sc.nextInt();
         
         int change = amountGiven-TotalPrice;
         System.out.println("change to return:"+change);
         
	}

}
