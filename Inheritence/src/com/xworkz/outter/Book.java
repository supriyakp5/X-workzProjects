package com.xworkz.outter;



    public class Book extends Publication {
        public Book() {
            super();
            System.out.println("Book is subclass");
        }

        public void read() {
            System.out.println("Book read");
        }

        public void summarize() {
            System.out.println("Book summarized");
        }
    }

