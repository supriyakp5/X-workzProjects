package com.xworkz.Tostring.internal;

public class AirConditioner {
    private String brand;
    private int modelNumber;
    private double powerConsumption;

    public AirConditioner(String brand, int modelNumber, double powerConsumption) {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "brand='" + brand + '\'' +
                ", modelNumber=" + modelNumber +
                ", powerConsumption=" + powerConsumption +
                " kWh}";
    }
    @Override
    public int hashCode()
    {
        return 1;
    }

}
