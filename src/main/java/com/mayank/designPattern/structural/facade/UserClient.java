package com.mayank.designPattern.structural.facade;

public class UserClient {

    private MovieBookingFacade movieBookingFacade = new MovieBookingFacade();

    public void bookMovie() {
        movieBookingFacade.bookMovie("mayank", "bangalore", "1", "visa");
    }

}
