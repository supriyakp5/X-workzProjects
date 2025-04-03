package com.xworkz.outter;


    public class Painting extends Artwork {
        public Painting() { super(); System.out.println("Painting is subclass"); }
        public void frame() { System.out.println("Painting framed"); }
        public void restore() { System.out.println("Painting restored"); }
}
