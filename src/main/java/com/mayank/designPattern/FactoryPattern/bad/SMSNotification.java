package com.mayank.designPattern.FactoryPattern.bad;

public class SMSNotification implements Notification {
    @Override
    public void send(String reciever, String message) {
        System.out.println("EMAIL SEND TO" + reciever + "with message" + message);
    }
}