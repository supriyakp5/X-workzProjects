package com.xworkz.Tostring.internal;

public class Router {
    private String name;
    private int id;
    private double value;

    public Router(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Router{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
