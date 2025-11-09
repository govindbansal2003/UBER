package com.govindbansal.project.uber.uberApp.strategies;

import com.govindbansal.project.uber.uberApp.entities.Driver;
import com.govindbansal.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
