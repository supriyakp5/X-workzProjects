package com.xworkz.inheritence.innternal.Writer;

public class WriterRunner {
    public static void main(String[] args) {
        Writer w1 = new Writer();
        w1.write();
        w1.edit();
        w1.publish();
        w1.research();

        System.out.println("-----");

        Writer w2 = new Poet();
        w2.write();
        w2.edit();
        w2.publish();
        w2.research();

        System.out.println("-----");

        Poet w3 = new Poet();
        w3.write();
        w3.edit();
        w3.publish();
        w3.research();
    }
}
