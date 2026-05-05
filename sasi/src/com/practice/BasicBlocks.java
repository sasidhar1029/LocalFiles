package com.practice;

public class BasicBlocks {
	{
		  System.out.println("instance block called");
	}
	public static void main(String[] args) {
		 BasicBlocks b2 = new BasicBlocks();
       System.out.println("main method stared:");
//       BasicBlocks b2 = new BasicBlocks();
	}
	static {
		System.out.println("static block called");
	}

}
