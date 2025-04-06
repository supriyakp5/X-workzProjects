package com.xworkz.inheritence.innternal.VehicleRental;

public class VehicleRentalRunner {
    public static void main(String[] args) {
        VehicleRental r1 = new VehicleRental();
        r1.bookVehicle();
        r1.showRates();
        r1.cancelBooking();

        System.out.println("-----");

        VehicleRental r2 = new CarRental();
        r2.bookVehicle();
        r2.showRates();
        r2.cancelBooking();

        System.out.println("-----");

        CarRental r3 = new CarRental();
        r3.bookVehicle();
        r3.showRates();
        r3.cancelBooking();
    }
}
