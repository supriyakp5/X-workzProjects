package com.xworkz.inheritence.innternal.Machine;

public class MachineRunner {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.start();
        m1.stop();
        m1.process();
        m1.reset();

        System.out.println("-----");

        Machine m2 = new WashingMachine();
        m2.start();
        m2.stop();
        m2.process();
        m2.reset();

        System.out.println("-----");

        WashingMachine m3 = new WashingMachine();
        m3.start();
        m3.stop();
        m3.process();
        m3.reset();
    }
}
