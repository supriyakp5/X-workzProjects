package com.xworkz.inheritence.innternal.Machine;

public class WashingMachine extends Machine{
    public WashingMachine() {
        super();
        System.out.println("WashingMachine constructor - child");
    }

    @Override
    public void start() {
        System.out.println("Starting wash cycle - child");
    }

    @Override
    public void stop() {
        System.out.println("Stopping wash cycle - child");
    }

    @Override
    public void process() {
        System.out.println("Washing clothes - child");
    }

    @Override
    public void reset() {
        System.out.println("Resetting wash program - child");
    }
}
