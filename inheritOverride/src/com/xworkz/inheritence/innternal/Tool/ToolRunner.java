package com.xworkz.inheritence.innternal.Tool;

public class ToolRunner {
    public static void main(String[] args) {
        Tool t1 = new Tool();
        t1.use();
        t1.getName();
        t1.getWeight();
        t1.getMaterial();
        t1.getPurpose();

        System.out.println("-----");

        Tool t2 = new Hammer();
        t2.use();
        t2.getName();
        t2.getWeight();
        t2.getMaterial();
        t2.getPurpose();

        System.out.println("-----");

        Hammer t3 = new Hammer();
        t3.use();
        t3.getName();
        t3.getWeight();
        t3.getMaterial();
        t3.getPurpose();
    }
}
