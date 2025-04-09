package com.xworkz.Tostring.internal;

public class Plier {
    private String name;
    private int id;
    private double value;

    public Plier(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Plier{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
