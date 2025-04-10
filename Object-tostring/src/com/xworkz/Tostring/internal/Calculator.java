package com.xworkz.Tostring.internal;

public class Calculator {
    private String model;
    private int functions;
    private double screenSize;

    public Calculator(String model, int functions, double screenSize) {
        this.model = model;
        this.functions = functions;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "model='" + model + '\'' +
                ", functions=" + functions +
                ", screenSize=" + screenSize + " inches" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 20;
    }

}
