package com.sasi;

public class S18 {
    String directorName;
    String heroName;
    String moviename;
    String heroineName;
    double budget;

    S18(String directorName) {
        this.directorName = directorName;
    }

    S18(S18 a, String heroName, String moviename) {
        this.directorName = a.directorName;
        this.heroName = heroName;
        this.moviename = moviename;  
    }

    S18(S18 b, String heroineName, double budget) {
        this.directorName = b.directorName;
        this.heroName = b.heroName;
        this.moviename = b.moviename;
        this.heroineName = heroineName;
        this.budget = budget;
    }

    public static void main(String[] args) {
        S18 s = new S18("rajamoli");
        s.show();
        
        S18 s1 = new S18(s, "maheshbabu", "SSMB29");
        s1.show();
        
        S18 s2 = new S18(s1, "kajal", 50000000.00);
        s2.show();
    }

    void show() {
        System.out.println("director name: " + directorName);
        System.out.println("hero name: " + heroName);
        System.out.println("heroine name: " + heroineName);
        System.out.println("movie budget: " + budget);
        System.out.println("movie name: " + moviename);
        System.out.println("*********************");
    }
}
