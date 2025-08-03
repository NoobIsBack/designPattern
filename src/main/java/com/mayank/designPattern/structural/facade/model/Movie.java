package com.mayank.designPattern.structural.facade.model;

public class Movie {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie(String name) {
        this.name = name;
    }
}
