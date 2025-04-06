package com.xworkz.inheritence.innternal.Ticket;

public class Ticket {
    public Ticket() {
        System.out.println("Ticket constructor - parent");
    }

    public void book() {
        System.out.println("Booking a generic ticket - parent");
    }

    public void cancel() {
        System.out.println("Canceling ticket - parent");
    }

    public void getType() {
        System.out.println("Type: General Ticket - parent");
    }

    public void getPrice() {
        System.out.println("Price: $10 - parent");
    }
}
