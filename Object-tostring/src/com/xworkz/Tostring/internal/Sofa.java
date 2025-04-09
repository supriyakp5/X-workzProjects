package com.xworkz.Tostring.internal;

public class Sofa {
    private String name;
    private int id;
    private double value;

    public Sofa(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
