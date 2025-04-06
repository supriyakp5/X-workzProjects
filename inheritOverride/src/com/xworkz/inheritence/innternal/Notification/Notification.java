package com.xworkz.inheritence.innternal.Notification;

public class Notification {
    public Notification() {
        System.out.println("Notification constructor - parent");
    }

    public void send() {
        System.out.println("Sending generic notification - parent");
    }

    public void getStatus() {
        System.out.println("Status: Sent - parent");
    }

    public void getChannel() {
        System.out.println("Channel: Default - parent");
    }

    public void getPriority() {
        System.out.println("Priority: Normal - parent");
    }
}
