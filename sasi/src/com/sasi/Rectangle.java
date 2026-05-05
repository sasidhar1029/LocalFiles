package com.sasi;

public class Rectangle {
	int width;
	int length;
	   Rectangle(){
		  System.out.println("no arg constructor called:");
	   }
	 Rectangle(int width,int length) {	
		this.width = width;
		this.length = length;
	}
	 Rectangle(Rectangle r){
		 this.width = r.width;
		 this.length = r.length;
	 }
	public static void main(String[] args) {
		Rectangle r2 = new Rectangle(20,79);
	      r2.show();
	}
	void show() {
		System.out.println(width);
		System.out.println(length);
	}

}
