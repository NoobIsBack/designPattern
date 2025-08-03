package com.mayank.designPattern.structural.facade.model;

public class Theatre {

    String location;
    Movie movie;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre(String location, Movie movie) {
        this.location = location;
        this.movie = movie;
    }
}
