package com.xworkz.outter;

    public class Juice extends Drink {
        public Juice() {
            super();
            System.out.println("Juice is subclass");
        }

        public void squeeze() {
            System.out.println("Juice squeezed");
        }

        public void blend() {
            System.out.println("Juice blended");


        }
    }
