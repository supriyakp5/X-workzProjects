package com.xworkz.outter;


public class Skyscraper extends Building {
        public Skyscraper() {
            super();
            System.out.println("Skyscraper is subclass");
        }

        public void elevate() {
            System.out.println("Skyscraper elevated");
        }

        public void illuminate() {
            System.out.println("Skyscraper illuminated");
        }
    }
