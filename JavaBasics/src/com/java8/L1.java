package com.java8;

public class L1 {
    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("Thread running using Lambda Expression");
        };

        Thread t = new Thread(r);
        t.start();
    }
}
