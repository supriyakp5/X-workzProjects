package com.xworkz.outter;

    public class Tennis extends Sport {
        public Tennis() {
            super();
            System.out.println("Tennis is subclass");
        }

        public void serve() {
            System.out.println("Tennis served");
        }

        public void volley() {
            System.out.println("Tennis volleyed");
        }
    }
