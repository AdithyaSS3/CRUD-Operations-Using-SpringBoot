package com.example.travels.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travels.model.Trip;
import com.example.travels.repository.TripRepository;

@Service
public class TripServiceImpl implements TripService{
	
	@Autowired
	private TripRepository tripRepo;

	@Override
	public List<Trip> showAllTrip() {
		
		return tripRepo.findAll();
	}

	@Override
	public Optional<Trip> searchTrip(String id) {
		// TODO Auto-generated method stub
		return tripRepo.findById(id);
	}

	@Override
	public Trip addNewTrip(Trip trip) {
		// TODO Auto-generated method stub
		return tripRepo.save(trip);
	}
	
	@Override
	public void deleteTrip(String id) {
		// TODO Auto-generated method stub
		tripRepo.deleteById(id);
	}
	

	

	

	
}