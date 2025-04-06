package com.xworkz.inheritence.innternal.Robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.start();
        r1.performTask();
        r1.shutdown();

        System.out.println("-----");

        Robot r2 = new CleaningRobot();
        r2.start();
        r2.performTask();
        r2.shutdown();

        System.out.println("-----");

        CleaningRobot r3 = new CleaningRobot();
        r3.start();
        r3.performTask();
        r3.shutdown();
    }
}
