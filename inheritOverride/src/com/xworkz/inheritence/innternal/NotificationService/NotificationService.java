package com.xworkz.inheritence.innternal.NotificationService;

public class NotificationService {
    public NotificationService() {
        System.out.println("NotificationService constructor - parent");
    }

    public void send() {
        System.out.println("Sending notification - parent");
    }

    public void schedule() {
        System.out.println("Scheduling notification - parent");
    }

    public void cancel() {
        System.out.println("Cancelling notification - parent");
    }

    public void report() {
        System.out.println("Generating report - parent");
    }
}
