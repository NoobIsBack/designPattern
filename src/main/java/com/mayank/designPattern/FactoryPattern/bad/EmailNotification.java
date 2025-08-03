package com.mayank.designPattern.FactoryPattern.bad;

public class EmailNotification implements Notification{
    @Override
    public void send(String reciever, String message) {
        System.out.println("EMAIL being send from " +  reciever + "with the message" + "message");
    }
}
