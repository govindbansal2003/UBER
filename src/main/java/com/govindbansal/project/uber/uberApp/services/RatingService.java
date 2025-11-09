package com.govindbansal.project.uber.uberApp.services;

import com.govindbansal.project.uber.uberApp.dto.DriverDto;
import com.govindbansal.project.uber.uberApp.dto.RiderDto;
import com.govindbansal.project.uber.uberApp.entities.Driver;
import com.govindbansal.project.uber.uberApp.entities.Ride;
import com.govindbansal.project.uber.uberApp.entities.Rider;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
