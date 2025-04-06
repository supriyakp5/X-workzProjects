package com.xworkz.inheritence.innternal.NotificationService;

public class SMSNotification extends NotificationService{
    public SMSNotification() {
        super();
        System.out.println("SMSNotification constructor - child");
    }

    @Override
    public void send() {
        System.out.println("Sending SMS - child");
    }

    @Override
    public void schedule() {
        System.out.println("Scheduling SMS - child");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling SMS - child");
    }

    @Override
    public void report() {
        System.out.println("SMS delivery report - child");
    }
}
