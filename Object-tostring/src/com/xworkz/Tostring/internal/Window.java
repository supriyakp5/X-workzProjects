package com.xworkz.Tostring.internal;

public class Window {
    private String name;
    private int id;
    private double value;

    public Window(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Window{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 91;
    }

}
