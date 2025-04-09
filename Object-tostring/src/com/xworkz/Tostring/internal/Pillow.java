package com.xworkz.Tostring.internal;

public class Pillow {
    private String name;
    private int id;
    private double value;

    public Pillow(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pillow{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }

}
