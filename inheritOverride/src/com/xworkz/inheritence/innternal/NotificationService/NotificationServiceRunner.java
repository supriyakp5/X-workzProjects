package com.xworkz.inheritence.innternal.NotificationService;

public class NotificationServiceRunner {
    public static void main(String[] args) {
        NotificationService n1 = new NotificationService();
        n1.send();
        n1.schedule();
        n1.cancel();
        n1.report();

        System.out.println("-----");

        NotificationService n2 = new SMSNotification();
        n2.send();
        n2.schedule();
        n2.cancel();
        n2.report();

        System.out.println("-----");

        SMSNotification n3 = new SMSNotification();
        n3.send();
        n3.schedule();
        n3.cancel();
        n3.report();
    }
}
