package com.javaintro;

public class Day32 {
        String employeeName;
        boolean hasAccessCard;
        boolean biometricMatch;
        boolean isblackListed;
        boolean doorHasPower;
public Day32(String employeeName, boolean hasAccessCard, boolean biometricMatch, boolean isblackListed,
				boolean doorHasPower) {
			
		    this.employeeName = employeeName;
			this.hasAccessCard = hasAccessCard;
			this.biometricMatch = biometricMatch;
			this.isblackListed = isblackListed;
			this.doorHasPower = doorHasPower;
		}

	public static void main(String[] args) {
		 Day32 d = new Day32("sasi",true,true,false,true);
          d.displayResult();
          Day32 d1 = new Day32("sai",false,true,false,true);
          d1.displayResult1();
	}
	boolean canAccess() {
		return   hasAccessCard && biometricMatch && (isblackListed) && doorHasPower;

}

	void displayResult() {
		canAccess();
		System.out.println(employeeName);
		System.out.println("can access"+canAccess());
		
	}
	boolean canAccess1() {
		return   hasAccessCard && biometricMatch || !(isblackListed) && doorHasPower;

}
	void displayResult1() {
		canAccess1();
		System.out.println(employeeName);
		System.out.println("can access the boolean:"+canAccess1());
		
	}
	}
