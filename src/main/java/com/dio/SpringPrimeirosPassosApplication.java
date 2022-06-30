package com.dio;

import com.dio.service.CarVehicleService;
import com.dio.service.VehicleService;
import com.dio.service.VehicleTestService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
												//
public class SpringPrimeirosPassosApplication {

	public static void main(String[] args) {

		ApplicationContext apc =  SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
		System.out.println("HELLO FROM SPRINGAPPLICATION .RUN dentro do MAIN");
//		//mostra todos os Beans da aplicação
//		for (String element : apc.getBeanDefinitionNames()){
//			System.out.println(element);
//		}
//
//		ConfigurableApplicationContext cac = SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
//		Alien a = cac.getBean(Alien.class);
//		System.out.println("________________________________________________________");
//		a.setName("TALES");
//		a.setTech("JAVA");
//		a.show();
//		System.out.println("________________________________________________________");
//
////		Alien b = cac.getBean(Alien.class);
////		b.setName("ROBERTO");
////		b.show();
////		System.out.println("________________________________________________________");
////
//
////		VehicleService vehicleService = cac.getBean(CarVehicleService.class);
////		vehicleService.startEngine();
////		vehicleService.move();
////		vehicleService.stopEngine();
//
//		VehicleTestService vehicleTestService = cac.getBean(VehicleTestService.class);
//		vehicleTestService.testVehicle();



	}

	// public class SpringPrimeirosPassosApplication implements CommandLineRunner, ApplicationRunner

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Hello from COmandLinerUNNER");
//	}
//
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("Hello from  ApplicationRunner IMPLEMENTATION ");
//	}


}

