package com.xworkz.outter;


    public class Fabric extends Material {
        public Fabric() {
            super();
            System.out.println("Fabric is subclass");
        }

        public void weave() {
            System.out.println("Fabric woven");
        }

        public void dye() {
            System.out.println("Fabric dyed");


        }
    }
