package com.xworkz.inheritence.innternal.Ticket;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.book();
        t1.cancel();
        t1.getType();
        t1.getPrice();

        System.out.println("-----");

        Ticket t2 = new MovieTicket();
        t2.book();
        t2.cancel();
        t2.getType();
        t2.getPrice();

        System.out.println("-----");

        MovieTicket t3 = new MovieTicket();
        t3.book();
        t3.cancel();
        t3.getType();
        t3.getPrice();
    }
}
