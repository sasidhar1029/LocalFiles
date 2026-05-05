//main method from Bike class
//no arg constructor from vehicle1
//no arg constructor from Bike
//
//
//By using Copy Constructor will get ReUsability .

package com.sasi;

public class S16 {
          S16(){
        	  System.out.println("no arg con from bike:");
          }
	public static void main(String[] args) {
	 S16 s = new S16();
	}

}
class Vehicle14 extends S16{
	Vehicle14(){
		System.out.println("no arg con from vehicle:");
	}
	
}
