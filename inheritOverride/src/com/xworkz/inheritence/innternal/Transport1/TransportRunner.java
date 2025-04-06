package com.xworkz.inheritence.innternal.Transport1;

public class TransportRunner {
    public static void main(String[] args) {
        Transport1 t1 = new Transport1();
        t1.start();
        t1.stop();
        t1.speed();
        t1.capacity();

        System.out.println("-----");

        Transport1 t2 = new Train();
        t2.start();
        t2.stop();
        t2.speed();
        t2.capacity();

        System.out.println("-----");

        Train t3 = new Train();
        t3.start();
        t3.stop();
        t3.speed();
        t3.capacity();
    }
}
