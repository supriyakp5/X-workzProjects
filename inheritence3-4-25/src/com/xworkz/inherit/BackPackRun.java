package com.xworkz.inherit;

public class BackPackRun {
    public static void main(String[] args) {
        Backpack backpack=new Backpack();
        backpack.capacity();
        backpack.color();
        backpack.compartments();
        backpack.material();
        backpack.waterResistance();
        System.out.println("---------------");
        Backpack backpack1=new BackpackDetails();
        backpack1.waterResistance();
        backpack1.material();
        backpack1.compartments();
        backpack1.color();
        backpack1.capacity();
    }
}
