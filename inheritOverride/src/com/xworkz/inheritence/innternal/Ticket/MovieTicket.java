package com.xworkz.inheritence.innternal.Ticket;

public class MovieTicket extends Ticket{
    public MovieTicket() {
        super();
        System.out.println("MovieTicket constructor - child");
    }

    @Override
    public void book() {
        System.out.println("Booking movie ticket - child");
    }

    @Override
    public void cancel() {
        System.out.println("Canceling movie ticket - child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Movie Ticket - child");
    }

    @Override
    public void getPrice() {
        System.out.println("Price: $15 - child");
    }
}
