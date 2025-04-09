package com.xworkz.Tostring.internal;

public class Juicer {
    private String name;
    private int id;
    private double value;

    public Juicer(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Juicer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
