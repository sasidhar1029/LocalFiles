package com.StringHandling;

public class S36 {

	public static void main(String[] args) {
		//constrcts a string buffer with no charcters in it and an initial capacity
		// of 16 charters of 16 charcters
		StringBuffer sb =new StringBuffer("Srikanth");
		System.out.println(sb.capacity());//24
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("SriknathsriKanthkSriknathsriKanthk");
		sb1.append("srikanth");
		
		System.out.println(sb1.capacity());//16
		
		StringBuffer sb2 =new StringBuffer("java");
		sb2.append("SrikanthSrikanth-SrikanthSrikanth-srikashdhjdsvds");
		sb2.append("sri");
		System.out.println(sb2.capacity());
		
	}

}
