package com.xworkz.inherit;

    public class Laptop1 extends Computer {
        public Laptop1() {
            super();
            System.out.println("Laptop is subclass");
        }
        public void portability() {
            System.out.println("Laptop is portable");
        }
        public void batteryLife() {
            System.out.println("Laptop battery life");
        }
}
