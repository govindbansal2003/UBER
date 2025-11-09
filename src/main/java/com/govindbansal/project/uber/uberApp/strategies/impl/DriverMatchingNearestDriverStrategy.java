package com.govindbansal.project.uber.uberApp.strategies.impl;

import com.govindbansal.project.uber.uberApp.entities.Driver;
import com.govindbansal.project.uber.uberApp.entities.RideRequest;
import com.govindbansal.project.uber.uberApp.repositories.DriverRepository;
import com.govindbansal.project.uber.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
