package com.xworkz.outter;



    public class Box extends Container {
        public Box() {
            super();
            System.out.println("Box is subclass");
        }

        public void pack() {
            System.out.println("Box packed");
        }

        public void unpack() {
            System.out.println("Box unpacked");
        }
    }

