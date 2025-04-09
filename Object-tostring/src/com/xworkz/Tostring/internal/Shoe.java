package com.xworkz.Tostring.internal;

public class Shoe {
    private String name;
    private int id;
    private double value;

    public Shoe(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
