package com.mayank.designPattern.FactoryPattern.bad;

public class PushNotification implements Notification{
    @Override
    public void send(String reciever, String message) {
        System.out.println("Push Notification Send from " + reciever + " message is " + message);
    }
}
