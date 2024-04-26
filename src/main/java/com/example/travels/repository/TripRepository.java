package com.example.travels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.travels.model.Trip;

public interface TripRepository extends JpaRepository<Trip, String> {

}
