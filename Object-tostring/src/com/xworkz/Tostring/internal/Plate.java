package com.xworkz.Tostring.internal;

public class Plate {
    private String name;
    private int id;
    private double value;

    public Plate(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }

}
