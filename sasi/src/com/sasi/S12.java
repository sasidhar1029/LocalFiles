package com.sasi;

public class S12 {

	public static void main(String[] args) {
	
		  int starters = 100;
		  int mainCourse = 200;
		  int desert = 50;
	int total = starters+mainCourse+desert;
		 int taxRate =(total*5)/100;
		 int taxrate = taxRate-total;
		int serviceCharge = (total*10)/100;
		int servicecharge = serviceCharge-total;
		int finalTotal = total+taxRate+serviceCharge;
		System.out.println("starters cost:"+starters);
		System.out.println("Main cousre cost:"+mainCourse);
		System.out.println("desert cost:"+desert);
		System.out.println("Total price:"+total);
		System.out.println("tax percentage:"+taxRate);
		System.out.println("after duction tax on total:"+taxrate);
		System.out.println("service chargers:"+serviceCharge);
		System.out.println("after duction  service on total:"+servicecharge);
		System.out.println("final cost:"+finalTotal);

				
				

	}

}
