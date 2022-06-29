package com.dio.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarVehicleService implements VehicleService {

   private Logger log = LoggerFactory.getLogger(CarVehicleService.class);

    @Override
    public void startEngine() {
        log.info("Starting car engine");
    }

    @Override
    public void move() {
        log.info("Driving away");

    }

    @Override
    public void stopEngine() {
        log.info("Stoping and turning off engine");

    }
}
