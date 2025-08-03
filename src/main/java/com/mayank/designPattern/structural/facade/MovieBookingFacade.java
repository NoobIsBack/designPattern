package com.mayank.designPattern.structural.facade;

import com.mayank.designPattern.structural.facade.model.Movie;
import com.mayank.designPattern.structural.facade.model.Theatre;
import com.mayank.designPattern.structural.facade.service.MovieService;
import com.mayank.designPattern.structural.facade.service.PaymentService;
import com.mayank.designPattern.structural.facade.service.SeatService;
import com.mayank.designPattern.structural.facade.service.TheatreService;

public class MovieBookingFacade {

    private MovieService movieService = new MovieService();
    private SeatService seatService = new SeatService();
    private PaymentService paymentService = new PaymentService();
    private TheatreService theatreService = new TheatreService();

    public boolean bookMovie(String movieName, String location, String seatId, String cardDetails) {
        Movie movie = movieService.getMovieByName(movieName);
        Theatre theatre = theatreService.getTheatre(movie, location);

        if (seatService.isAvailable(theatre, seatId)) {
            seatService.bookSeat(seatId);
            paymentService.processPayment(cardDetails);
            System.out.println("Booked Successfull");
            return true;
        }

        System.out.println("Seat Not Avaialble/Server Error");
        return false;
    }




}
