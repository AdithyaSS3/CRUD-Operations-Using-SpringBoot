package com.example.travels.service;

import java.util.List;
import java.util.Optional;

import com.example.travels.model.Trip;

public interface TripService {

	List<Trip> showAllTrip();
	
	Optional<Trip> searchTrip(String id);
	Trip addNewTrip(Trip trip);
	void deleteTrip (String id);
}
