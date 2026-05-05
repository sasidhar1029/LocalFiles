package com.dailyAssignments;

public class Oct10_2 {

    public static void main(String[] args) {
        String s = "AKKABNBY";
        System.out.println(removeAdjacentDuplicates(s));
    }

    private static String removeAdjacentDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; ) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i, i + 2);
                i = 0;
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
