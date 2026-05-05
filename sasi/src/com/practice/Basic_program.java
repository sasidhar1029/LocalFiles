package com.practice;

public class Basic_program {
	int jersyNo;
	String name;
      int age;
      static String CountryName = "india";
      static int countryId =91;
	public static void main(String[] args) {
		Basic_program  b1 = new Basic_program ();
		b1.jersyNo=7;
		b1.name ="Dhoni";
		b1.age = 21;
	  b1.main1();
		System.out.println("*** Object2 info****");
		Basic_program  b2 = new Basic_program ();
		CountryName = "iran";
		  countryId=92;
		b2.jersyNo = 18;
		b2.name = "virat";
		b2.age =33;
		b2.main1();
		
	}
    void main1() {
		System.out.println(jersyNo);
		System.out.println(name);
		System.out.println(age);
		System.out.println(CountryName);
		System.out.println(countryId);
   }

}
