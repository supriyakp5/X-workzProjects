package com.xworkz.Tostring.internal;

public class Stapler {
    private String name;
    private int id;
    private double value;

    public Stapler(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stapler{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
