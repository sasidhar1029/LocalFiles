//in how many ways can you make an object egilible for garbage collection in java.Explain with suitable example program
package com.javaintro;


public class Sasi {

	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Vcube software solutions");
		System.out.println("Vcube software ");
	}
	public static void main(String[] args) {
		
		Sasi s1 = new Sasi();
		Sasi s2 = new Sasi();
		Sasi s3 = new Sasi();
		Sasi s4 = new Sasi();
		
		//nullyfying the object.
		s1 = null;
//		s4 = s2;
		
		System.gc();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
