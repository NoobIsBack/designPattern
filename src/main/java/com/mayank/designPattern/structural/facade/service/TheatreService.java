package com.mayank.designPattern.structural.facade.service;

import com.mayank.designPattern.structural.facade.model.Movie;
import com.mayank.designPattern.structural.facade.model.Theatre;

public class TheatreService {

    public Theatre getTheatre(Movie movie, String location) {
        return new Theatre("bangalore", new Movie("Kalyuug"));
    }
}
