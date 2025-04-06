package com.xworkz.inheritence.innternal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.print();
        p1.scan();
        p1.connect();
        p1.power();

        System.out.println("-----");

        Printer p2 = new LaserPrinter();
        p2.print();
        p2.scan();
        p2.connect();
        p2.power();

        System.out.println("-----");

        LaserPrinter p3 = new LaserPrinter();
        p3.print();
        p3.scan();
        p3.connect();
        p3.power();
    }
}
