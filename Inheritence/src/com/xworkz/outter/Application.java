package com.xworkz.outter;


    public class Application extends Software {
        public Application() {
            super();
            System.out.println("Application is subclass");
        }

        public void run() {
            System.out.println("Application running");
        }

        public void update() {
            System.out.println("Application updated");
        }
    }

