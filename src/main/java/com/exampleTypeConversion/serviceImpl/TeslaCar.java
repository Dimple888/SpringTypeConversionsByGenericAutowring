package com.exampleTypeConversion.serviceImpl;

import org.springframework.stereotype.Service;

import com.exampleTypeConversion.service.Car;

@Service
public class TeslaCar implements Car {

	@Override
	public String drive() {
		
		return "Driving in TeslaCar";
	}
	
	

}
