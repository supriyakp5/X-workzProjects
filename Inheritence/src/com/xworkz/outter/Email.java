package com.xworkz.outter;



    public class Email extends Communication {
        public Email() {
            super();
            System.out.println("Email is subclass");
        }

        public void reply() {
            System.out.println("Email replied");
        }

        public void forward() {
            System.out.println("Email forwarded");

        }
    }
