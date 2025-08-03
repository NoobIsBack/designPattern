package com.mayank.designPattern.BuilderPattern;

public class UserProfile {

    private String name;
    private String email;
    private String address;
    private String phone;
    private int age;

    public UserProfile(String name, String email, String address, String phone, int age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }
}
