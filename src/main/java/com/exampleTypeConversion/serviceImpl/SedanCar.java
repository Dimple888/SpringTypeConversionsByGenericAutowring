package com.exampleTypeConversion.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.exampleTypeConversion.service.Car;

@Service
//@Primary
public class SedanCar implements Car {

	@Override
	public String drive() {
		
		return "Driving in SedanCar";
	}

}
