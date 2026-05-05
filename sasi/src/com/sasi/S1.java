// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
package com.sasi;
class S1
{
	String name;
	String color;
	  S1(String name,String color){
		  this.name = name;
		  this.color = color;
	  }
	  S1(){
		  System.out.println("fdghjkl");
	  }
  
public static void main(String[] args) {
	 S1 s = new S1("honey","white");
	s.show();
}
void show() {
	System.out.println(name);
	System.out.println(color);
}
}

    