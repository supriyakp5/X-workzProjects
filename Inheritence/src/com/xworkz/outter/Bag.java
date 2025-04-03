package com.xworkz.outter;


    public class Bag extends Container {
        public Bag() {
            super();
            System.out.println("Bag is subclass");
        }

        public void carry() {
            System.out.println("Bag carried");
        }

        public void fold() {
            System.out.println("Bag folded");
        }
    }
