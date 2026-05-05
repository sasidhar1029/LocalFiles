package com.practice;

public class Blocks_2 {
	{
		System.out.println("instance block load");
//		Blocks_2 b1 = new Blocks_2();
	}
	public static void main(String[] args) {
		System.out.println("main method called");
		Blocks_2 b1 = new Blocks_2();
	}
		{
		System.out.println("static block load");
		Blocks_2 b1 = new Blocks_2();
	}
	}

