package com.xworkz.inheritence.innternal.Robot;

public class Robot {
    public Robot() {
        System.out.println("Robot constructor - parent");
    }

    public void start() {
        System.out.println("Starting robot - parent");
    }

    public void performTask() {
        System.out.println("Performing general task - parent");
    }

    public void shutdown() {
        System.out.println("Shutting down robot - parent");
    }
}
