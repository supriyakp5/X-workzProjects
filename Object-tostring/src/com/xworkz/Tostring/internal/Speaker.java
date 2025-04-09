package com.xworkz.Tostring.internal;

public class Speaker {
    private String name;
    private int id;
    private double value;

    public Speaker(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
