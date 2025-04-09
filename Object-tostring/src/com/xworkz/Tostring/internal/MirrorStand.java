package com.xworkz.Tostring.internal;

public class MirrorStand {
    private String name;
    private int id;
    private double value;

    public MirrorStand(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MirrorStand{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
