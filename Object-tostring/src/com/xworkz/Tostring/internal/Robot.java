package com.xworkz.Tostring.internal;

public class Robot {
    private String name;
    private int id;
    private double value;

    public Robot(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
