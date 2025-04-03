package com.xworkz.outter;



    public class Robot extends Machine {
        public Robot() {
            super();
            System.out.println("Robot is subclass");
        }

        public void move() {
            System.out.println("Robot moved");
        }

        public void process() {
            System.out.println("Robot processed");
        }
    }
