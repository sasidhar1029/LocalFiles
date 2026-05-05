package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CricketsList {

	public static void main(String[] args) {
		Cricketers c1 = new Cricketers(7, "msDhoni", "csk", 1);
		Cricketers c2 = new Cricketers(7, "virat", "rcb", 4);
		Cricketers c3 = new Cricketers(45, "Rohit", "mi", 3);
		Cricketers c4 = new Cricketers(8, "jaddu", "csk", 2);
		List<Cricketers> criclist = new ArrayList<>();
		criclist.add(c1);
		criclist.add(c2);
		criclist.add(c3);
		criclist.add(c4);
		System.out.println(criclist);
	}

}
