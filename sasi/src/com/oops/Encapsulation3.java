package com.oops;

public class Encapsulation3 {

	public static void main(String[] args) {
		Encapsulation2 e2 = new Encapsulation2();
		e2.setSid(12);
		e2.setString("sasi");
		e2.setAge(22);
		
		e2.setSid(2);
		e2.setString("subbu");
		e2.setAge(32);
		System.out.println(e2.getSid());
		System.out.println(e2.getString());
		System.out.println(e2.getAge());
		System.out.println(e2.getSid());
		System.out.println(e2.getString());
		System.out.println(e2.getAge());
		System.out.println(e2.getSid());
		System.out.println(e2.getString());
		System.out.println(e2.getAge());
	}
}
