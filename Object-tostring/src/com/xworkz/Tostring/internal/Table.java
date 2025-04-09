package com.xworkz.Tostring.internal;

public class Table {
    private String name;
    private int id;
    private double value;

    public Table(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
