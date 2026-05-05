package com.sasi;

public class S13 {
    static double calculateSubtotal(double starters,double maincourse,double desert) {
     return starters+maincourse+desert;
}
    static double calculatetax(double subtotal) {
    	return (subtotal*5)/100;
    			
    }
    static double calculateServicetax(double subtotal) {
    	return (subtotal*10)/100;
    }
    static double calculateFinaltotal(double subtotal,double tax,double servicetax) {
    	return subtotal+tax+servicetax;
    }
	public static void main(String[] args) {
      double starters = 100;
      double mainCourse = 270;
      double desert  = 80;
      double subtotal = calculateSubtotal(starters,mainCourse,desert);
      double tax = calculatetax(subtotal);
      double servicetax = calculateServicetax(subtotal);
      double finalAmount = calculateFinaltotal(subtotal,tax,servicetax);
      
      System.out.println("starters price:"+starters);
      System.out.println("Main cousre price:"+mainCourse);
      System.out.println("desert price:"+desert);
      System.out.println("Total price of starters,maincourse and desert:"+subtotal);
      System.out.println("Tax(5%) on subtotal:"+tax);
      System.out.println("service(10%) tax on subtotal:"+servicetax);
      System.out.println("display the final amount after adding tax and service chargers:"+finalAmount);
	}

}
