package com.tap.airport.dao;

import java.util.List;

import com.tap.airpoet.entity.AirportEntity;

public interface AirportDAO {
	void saveAirportEntity(AirportEntity entity);
	AirportEntity getAirportEntityById(int id);
	void updateAirportEntityByName(String Name);
	void updateAirportEntityById(int id);
	void updateAirportEntityByLocatio(String location);
	void deleteAirportEntity(int id);
	List<AirportEntity>getAllAirportEntities();
}
