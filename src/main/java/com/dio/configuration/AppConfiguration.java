package com.dio.configuration;

import com.dio.service.CarVehicleService;
import com.dio.service.PlaneVehicleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.dio.service.VehicleService;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {
    @Bean
   // @Qualifier("CarVehicleServiceConfiguration")
@ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "car", matchIfMissing = false)
    public VehicleService CarVehicleServiceConfiguration(){
        return new CarVehicleService();
    }

    @Bean
    // primary define o Bean que será injetado pelo container pois os dois são do tipo vehicle, logo, precisa ser especificado qual será chamado no main ao iniciar vehicle.startEngine()
    //@Primary
   // @Qualifier("PlaneVehicleServiceConfiguration")
    @ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "plane", matchIfMissing = true)
    public PlaneVehicleService PlaneVehicleServiceConfiguration(){
        return new PlaneVehicleService();
    }
}
