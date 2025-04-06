package com.xworkz.inheritence.innternal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School s1 = new School();
        s1.open();
        s1.teach();
        s1.bellRing();
        s1.close();

        System.out.println("-----");

        School s2 = new HighSchool();
        s2.open();
        s2.teach();
        s2.bellRing();
        s2.close();

        System.out.println("-----");

        HighSchool s3 = new HighSchool();
        s3.open();
        s3.teach();
        s3.bellRing();
        s3.close();
    }
}
