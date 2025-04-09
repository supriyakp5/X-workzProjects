package com.xworkz.Tostring.internal;

public class ClockRadio {
    private String brand;
    private int alarmCount;
    private double frequencyRange;

    public ClockRadio(String brand, int alarmCount, double frequencyRange) {
        this.brand = brand;
        this.alarmCount = alarmCount;
        this.frequencyRange = frequencyRange;
    }

    @Override
    public String toString() {
        return "ClockRadio{" +
                "brand='" + brand + '\'' +
                ", alarmCount=" + alarmCount +
                ", frequencyRange=" + frequencyRange + " MHz" +
                '}';
    }
}
