package com.xworkz.inheritence.innternal.Notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification n1 = new Notification();
        n1.send();
        n1.getStatus();
        n1.getChannel();
        n1.getPriority();

        System.out.println("-----");

        Notification n2 = new EmailNotification();
        n2.send();
        n2.getStatus();
        n2.getChannel();
        n2.getPriority();

        System.out.println("-----");

        EmailNotification n3 = new EmailNotification();
        n3.send();
        n3.getStatus();
        n3.getChannel();
        n3.getPriority();
    }
}
