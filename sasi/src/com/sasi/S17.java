package com.sasi;

public class S17 {
   String name = "lotus";
	public static void main(String[] args) {
	System.out.println("main method called from s17:");

	}


}
class Flower extends S17{
	public static void main(String[] args) {
		System.out.println("main method ");
		Flower f = new Flower();
		
		f.show();
	
	}
	void show() {
		System.out.println(name);
	}
}
