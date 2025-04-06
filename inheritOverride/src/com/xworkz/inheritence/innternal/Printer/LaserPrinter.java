package com.xworkz.inheritence.innternal.Printer;

public class LaserPrinter extends Printer{
    public LaserPrinter() {
        super();
        System.out.println("LaserPrinter constructor - child");
    }

    @Override
    public void print() {
        System.out.println("High-speed laser printing - child");
    }

    @Override
    public void scan() {
        System.out.println("Scanning in HD - child");
    }

    @Override
    public void connect() {
        System.out.println("Connected via Wi-Fi - child");
    }

    @Override
    public void power() {
        System.out.println("Laser printer power ON - child");
    }

}
