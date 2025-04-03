package com.xworkz.outter;




    public class Dessert extends Food {
        public Dessert() {
            super();
            System.out.println("Dessert is subclass");
        }

        public void sweeten() {
            System.out.println("Dessert sweetened");
        }

        public void chill() {
            System.out.println("Dessert chilled");
        }
    }
