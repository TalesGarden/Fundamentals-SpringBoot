package com.dio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {

    @Autowired
//    @Qualifier("PlaneVehicleServiceConfiguration")
    VehicleService vehicleService;

    public void testVehicle(){
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
    }
}
