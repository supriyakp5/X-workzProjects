package com.xworkz.Tostring.internal;

public class Sink {
    private String name;
    private int id;
    private double value;

    public Sink(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
