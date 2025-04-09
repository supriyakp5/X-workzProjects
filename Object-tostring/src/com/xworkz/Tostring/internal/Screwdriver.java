package com.xworkz.Tostring.internal;

public class Screwdriver {
    private String name;
    private int id;
    private double value;

    public Screwdriver(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Screwdriver{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
