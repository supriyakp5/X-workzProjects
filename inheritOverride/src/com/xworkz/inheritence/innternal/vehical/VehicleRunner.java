package com.xworkz.inheritence.innternal.vehical;

public class VehicleRunner {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.move();
        vehicle1.fuelType();
        vehicle1.capacity();
        vehicle1.usage();

        System.out.println("-------------------");
        Vehicle vehicle = new Car();
        vehicle.move();
        vehicle.fuelType();
        vehicle.capacity();
        vehicle.usage();

        System.out.println("-------------------");
        Car car = new Car();
        car.move();
        car.fuelType();
        car.capacity();
        car.usage();
    }
}

