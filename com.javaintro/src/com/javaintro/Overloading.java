//Write a Java program that uses method overloading with methods of the same name to perform the following operations:
//If the user enters a character, the program should return its Unicode (integer) value.
//If the user enters a Unicode integer value, the program should return the corresponding ASCII character.
//Note:
//Use the same method name for both operations.
//Demonstrate the functionality in the main method.

package com.javaintro;
//import java.util.Scanner;
public class Overloading {
static char  unicode(int a){
			return (char) a;
//  		
  	   
  	} 
  	  static int unicode(char b) {
//  		
  		  return  b;
  	 }

	public static void main(String[] args) {
     	//Overloading sc = new Overloading();
     	char unicode1 = unicode(65);
     	System.out.println(unicode1);
     	int unicode2 = (char) unicode('c');


     	System.out.println(unicode2);

	}

}
