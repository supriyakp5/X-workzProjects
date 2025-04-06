package com.xworkz.inheritence.innternal.Robot;

public class CleaningRobot extends Robot{
    public CleaningRobot() {
        super();
        System.out.println("CleaningRobot constructor - child");
    }

    @Override
    public void performTask() {
        System.out.println("Vacuuming the floor - child");
    }

    @Override
    public void start() {
        System.out.println("Cleaning robot activated - child");
    }

    @Override
    public void shutdown() {
        System.out.println("Cleaning robot powered off - child");
    }
}
