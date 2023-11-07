package com.tap.airpoet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airpoet_table")
public class AirportEntity {
	
	
	public AirportEntity() {
		
		// TODO Auto-generated constructor stub
	}

	@Column(name="AIRPORT_ID")
	@Id
	
	private int airportID;
	
	public int getAirportID() {
		return airportID;
	}

	public void setAirportID(int airportID) {
		this.airportID = airportID;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	public AirportEntity(int airportID, String airportName, String airportLocation, int noOfPlanes, int noOfRunways) {
		
		this.airportID = airportID;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.noOfPlanes = noOfPlanes;
		this.noOfRunways = noOfRunways;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	public int getNoOfPlanes() {
		return noOfPlanes;
	}

	public void setNoOfPlanes(int noOfPlanes) {
		this.noOfPlanes = noOfPlanes;
	}

	public int getNoOfRunways() {
		return noOfRunways;
	}

	public void setNoOfRunways(int noOfRunways) {
		this.noOfRunways = noOfRunways;
	}

	@Column(name="AIRPORT_NAME")
	private String airportName;
	
	@Column(name="AIRPORT_LOCATION")
	private String airportLocation;
	
	@Column(name="NO_OF_PLANES")
	private int noOfPlanes;
	
	@Column(name="NO_OF_RUNWAYS")
	private int noOfRunways;
	
}
