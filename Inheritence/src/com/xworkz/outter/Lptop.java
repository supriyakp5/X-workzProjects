package com.xworkz.outter;

    public class Laptop extends Computer {
        public Laptop() {
            super();
            System.out.println("Laptop is subclass");
        }

        public void portability() {
            System.out.println("Laptop is portable");
        }

        public void batteryLife() {
            System.out.println("Laptop battery life");
        }

        public static void main(String[] args) {
        }
    }