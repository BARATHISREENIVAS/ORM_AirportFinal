package com.tap.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//
import org.springframework.stereotype.Component;
//
@Component
public class Airport {
	

	@Value("kemp")
	String airportName;
	@Value("ban")			
	String airportLocation;
	@Value("True")
	boolean isAirportInternational;
	@Value("10")
	int noOfRunways;
				//@Autowired is used to initliaze properties of object type or non premitive type
								//and this is calles as field level injection
	Runway runway;

	

//	public Airport(String airportName, String airportLocation, boolean isAirportInternational, int noOfRunways,
//			Runway runway) {
//		
//		this.airportName = airportName;
//		this.airportLocation = airportLocation;
//		this.isAirportInternational = isAirportInternational;
//		this.noOfRunways = noOfRunways;
//		this.runway = runway;
//	}


	@Autowired	
	public Airport(Runway runway) {
		super();
		this.runway = runway;
	}



	public void setRunway(Runway runway) {
		this.runway = runway;
	}
	
//	public Airport() {
//		System.out.println("Airport created");
//	}
	
	
//	@Value("Tirupathi")
//	public void setAirportName(String airportName) {
//		this.airportName = airportName;
//	}
//	@Value("Tpt")
//	public void setAirportLocation(String airportLocation) {
//		this.airportLocation = airportLocation;
//	}
//	@Value("True")
//	public void setAirportInternational(boolean isAirportInternational) {
//		this.isAirportInternational = isAirportInternational;
//	}
//	@Value("10")
//	public void setNoOfRunways(int noOfRunways) {
//		this.noOfRunways = noOfRunways;
//	}

	
	
	
}
