package com.xworkz.inheritence.innternal.Content;

public class ContentRunner {
    public static void main(String[] args) {
        Content c1 = new Content();
        c1.write();
        c1.edit();
        c1.publish();
        c1.archive();

        System.out.println("-----");

        Content c2 = new BlogPost();
        c2.write();
        c2.edit();
        c2.publish();
        c2.archive();

        System.out.println("-----");

        BlogPost c3 = new BlogPost();
        c3.write();
        c3.edit();
        c3.publish();
        c3.archive();
    }
}
