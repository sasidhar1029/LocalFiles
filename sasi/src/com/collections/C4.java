package com.collections;

import java.util.ArrayList;
import java.util.List;

public class C4 {

	public static void main(String[] args) {
//		List <Integer> l =new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		l.add(10);
//		l.add(20);    //10 20 10 20
//		l.add(1, 100);//10 100 20 10 20
//		l.add(0,31);  //31 10 100 20 10 20
//		l.add(1,null);//31 null 10 100 20 10 20 
//		System.out.println(l);
		List <Integer> l =new ArrayList<>();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(40);
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(40);
		
		System.out.println(l);
		System.out.println(l.size());
	}

}
