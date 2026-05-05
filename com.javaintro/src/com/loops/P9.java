package com.loops;

public class P9 {
      void show(int a ) {
    	  System.out.println("int");
      }
      void show(Integer a) {
    	  System.out.println("integer");
      }
    public static void main(String[] args) {
         P9 p = new P9();
         p.show(null);
    }
}
