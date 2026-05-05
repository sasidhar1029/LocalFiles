package com.javaintro;

import java.util.Scanner;

public class Day36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a category");
		String ctg = sc.nextLine();

		switch (ctg) {
		
		case "fruits": {

			System.out.println("enter a item:");
			String item = sc.nextLine();
			switch (item) {
			case "ap" -> System.out.println("apple");
			case "ban" -> System.out.println("banan");
			case "orn" -> System.out.println("orange");
			case "mn" -> System.out.println("mango");
			default -> System.out.println("entered items are not avaliable");
			}
			break;
		}
		case "veggies": {

			System.out.println("enter a item:");
			String item = sc.nextLine();
			switch (item) {
			case "tmt" -> System.out.println("tomato");
			case "ptt" -> System.out.println("potato");
			case "cr" -> System.out.println("carrot");
			default -> System.out.println("entered item is not there");
			}
			break;
		}

		default:
			System.out.println("enter catagory or items are not avalible");
		}

	}

}
