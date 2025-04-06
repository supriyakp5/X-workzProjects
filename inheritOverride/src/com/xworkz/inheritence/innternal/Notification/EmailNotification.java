package com.xworkz.inheritence.innternal.Notification;

public class EmailNotification extends Notification{
    public EmailNotification() {
        super();
        System.out.println("EmailNotification constructor - child");
    }

    @Override
    public void send() {
        System.out.println("Sending email notification - child");
    }

    @Override
    public void getStatus() {
        System.out.println("Status: Delivered via email - child");
    }

    @Override
    public void getChannel() {
        System.out.println("Channel: Email - child");
    }

    @Override
    public void getPriority() {
        System.out.println("Priority: High - child");
    }
}
