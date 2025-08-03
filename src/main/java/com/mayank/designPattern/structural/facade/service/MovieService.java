package com.mayank.designPattern.structural.facade.service;

import com.mayank.designPattern.structural.facade.model.Movie;

public class MovieService {

    public Movie getMovieByName(String name) {
        return new Movie("Movie");
    }
}
