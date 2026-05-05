package com.javaintro;

public class Day31 {
    String vehicleNumber;
    static double petrolPrice =108.97;
    static double dieselPrice = 96.15;
    double totalAmount;
    void  method1(int petrol,String vehicleNumber) {
    	
           
           double petrolPurches1 =  (petrol*petrolPrice);
           System.out.println("vehicle Number:"+vehicleNumber);
           System.out.println("total petrol:"+petrol);
           System.out.println("total cost:"+petrolPurches1);
           System.out.println("****************");
    }
    void  method2(int diesel,String vehicleNumber) {
    	
      
        double dieselPurches2 =  (diesel*dieselPrice);
        System.out.println("vehicle number:"+vehicleNumber);
        System.out.println("totaldiesel:"+diesel);
        System.out.println("total diesel price:"+dieselPurches2);
        System.out.println("********************");
        
 }
    
	public static void main(String[] args) {
		
         Day31 d = new Day31();
         d.method1(12, "Ap279095");
         d.method2(15, "Ts398073");
         d.method1(13,"Tg6789003");
	}

}
