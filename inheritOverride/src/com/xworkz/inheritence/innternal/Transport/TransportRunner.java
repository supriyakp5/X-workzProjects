package com.xworkz.inheritence.innternal.Transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport t1 = new Transport();
        t1.start();
        t1.stop();
        t1.fuelType();
        t1.capacity();
        t1.mode();

        System.out.println("-----");

        Transport t2 = new Airplane();
        t2.start();
        t2.stop();
        t2.fuelType();
        t2.capacity();
        t2.mode();

        System.out.println("-----");

        Airplane t3 = new Airplane();
        t3.start();
        t3.stop();
        t3.fuelType();
        t3.capacity();
        t3.mode();
    }
}
