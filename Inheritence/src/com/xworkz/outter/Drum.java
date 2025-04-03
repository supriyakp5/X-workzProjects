package com.xworkz.outter;


    public class Drum extends Instrument {
        public Drum() {
            super();
            System.out.println("Drum is subclass");
        }

        public void beat() {
            System.out.println("Drum beaten");
        }

        public void tuneSkin() {
            System.out.println("Drum skin tuned");
        }
    }
