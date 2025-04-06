package com.xworkz.inheritence.innternal.Flight;

public class FlightRunner {
    public static void main(String[] args) {
        Flight f1 = new Flight();
        f1.takeOff();
        f1.getDuration();
        f1.getType();
        f1.land();

        System.out.println("-----");

        Flight f2 = new InternationalFlight();
        f2.takeOff();
        f2.getDuration();
        f2.getType();
        f2.land();

        System.out.println("-----");

        InternationalFlight f3 = new InternationalFlight();
        f3.takeOff();
        f3.getDuration();
        f3.getType();
        f3.land();
    }
}
