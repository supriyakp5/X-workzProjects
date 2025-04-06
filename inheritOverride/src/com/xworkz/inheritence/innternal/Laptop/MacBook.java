package com.xworkz.inheritence.innternal.Laptop;

class MacBook extends Laptop {
    public MacBook() {
        super();
        System.out.println("Running non-arg constructor MacBook--child");
    }

    @Override
    public void powerOn() {
        System.out.println("MacBook powerOn method--child");
    }

    @Override
    public void getBrand() {
        System.out.println("MacBook getBrand method--child");
    }

    @Override
    public void getModel() {
        System.out.println("MacBook getModel method--child");
    }

    @Override
    public void getOS() {
        System.out.println("MacBook getOS method--child");
    }

    @Override
    public void getPrice() {
        System.out.println("MacBook getPrice method--child");
    }
}
