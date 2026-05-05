package com.sasi;

public class S19 {
       String vehicleNumber;
       double petrolLiters;
       double dieselLiters;
       double totalAmount;
       
        static double PETROL_PRICE_PER_LITRE =110.19;
        static double diesel_price_per_liter = 93.49;
       S19(String vehicleNumber){
    	   this.vehicleNumber =vehicleNumber;
       }
       void buyPetrol(double liters) {
    	   petrolLiters += liters;
    	   double cost = liters*PETROL_PRICE_PER_LITRE;
    	   totalAmount +=cost;
    	   System.out.println("Petrol purchased: " + liters + " litres");
             System.out.println("cost for petrol:"+cost);
       }
       void buyDiesel(double liters) {
    	   dieselLiters += liters;
    	   double cost = liters*diesel_price_per_liter;
    	   totalAmount +=cost;
    	   System.out.println("Petrol purchased: " + liters + " litres");
             System.out.println("cost for petrol:"+cost);
       }
       void purchesdetails() {
    	   System.out.println(vehicleNumber);
    	   System.out.println(petrolLiters);
    	   System.out.println(dieselLiters);
    	   System.out.println(totalAmount);
    	   System.out.println("--------------------------");
       }
	public static void main(String[] args) {
	   S19 s = new S19("ap279095");
	   s.buyPetrol(19);
	   s.purchesdetails();
	   S19 s1 = new S19("ts567892");
	   s1.buyDiesel(29);
	   s1.buyDiesel(12);
	   s1.purchesdetails();
	}

}
