package com.sasi;

public class S35 {
      static int count=0;
      static void recurse(int n) {
    	  if(n>0) {
    		  recurse(n--);
    		  System.out.println(n+" ");
    	  }
      }
	public static void main(String[] args) {
	 recurse(3);
	}

}
