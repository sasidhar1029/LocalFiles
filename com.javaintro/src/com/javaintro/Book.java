package com.javaintro;

public class Book {
	 static int bookId = 1;
	 static String title = "rich dad";
	 static String author="prasanna";
	 static double price = 400;
//	static int discount=10;
	 
	public static void main(String[] args) {
	Book b1 = new Book();
   double dpercentage = (price*10)/100;
    double finPrice= price-dpercentage;
    
	
		System.out.println(bookId);
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
//		System.out.println(dpercentage);
		System.out.println("final price:"+finPrice);
	
	}
	

}
