package com.tap.airport.service;

import org.springframework.stereotype.Component;

import com.tap.airpoet.entity.AirportEntity;

import net.bytebuddy.asm.Advice.This;
@Component
public class AirportServiceImplementation implements AirportService {
	
	public AirportServiceImplementation() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}

	
	public boolean validateAirportEntity(AirportEntity entity) {
		boolean flag=false;
		if(entity==null) {
			throw new IllegalArgumentException("AirportEntity cannot be null...");
		}
		if(entity.getAirportName()!=null && !entity.getAirportName().isEmpty() && !entity.getAirportName().isBlank()) {
			flag=true;
		}
		if(entity.getAirportLocation()!=null && !entity.getAirportLocation().isEmpty() && !entity.getAirportLocation().isBlank()) {
			flag=true;
		}
		if(entity.getNoOfPlanes()>0) {
			flag=true;
		}
		if(entity.getNoOfRunways()>0) {
			flag=true;
		}
		return flag;
	}

}
