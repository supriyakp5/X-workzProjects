package com.xworkz.inheritence.innternal.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival f1 = new Festival();
        f1.plan();
        f1.promote();
        f1.organize();
        f1.conclude();

        System.out.println("-----");

        Festival f2 = new MusicFestival();
        f2.plan();
        f2.promote();
        f2.organize();
        f2.conclude();

        System.out.println("-----");

        MusicFestival f3 = new MusicFestival();
        f3.plan();
        f3.promote();
        f3.organize();
        f3.conclude();
    }
}
