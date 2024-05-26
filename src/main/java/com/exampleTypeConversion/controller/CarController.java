package com.exampleTypeConversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleTypeConversion.customQualifier.CarQualifier;
import com.exampleTypeConversion.service.Car;

@RestController
@RequestMapping("/cars")
public class CarController {

	// by running we'll get error as Action:

//Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed

//	@Autowired
//	@Qualifier("sedanCar") -- method 1
//	private Car car;

	// another way of using qualifier is by using constructor - method 2

	private final Car car;

//	@Autowired
//	public CarController(@Qualifier("teslaCar") Car car) {
//
//		this.car = car;
//	}

	// use custom qualifier "CarQualifier"

	@Autowired
	public CarController(@CarQualifier("sedanCar") Car car) {

		this.car = car;
	}

	@GetMapping("/getcar")
	public String drive() {

		return car.drive();
	}

}
