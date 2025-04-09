package com.xworkz.Tostring.internal;

public class Mug {
    private String name;
    private int id;
    private double value;

    public Mug(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
