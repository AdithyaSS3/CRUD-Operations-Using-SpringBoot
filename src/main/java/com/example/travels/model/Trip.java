package com.example.travels.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sri_travels")
public class Trip {
	
	@Id
	private String tripId;
	
	private String custName;
	
	@Column (name = "v_name")
	private String vehicle;
	
	private String noOfPassengers;
	private String vehicleNo;
	private String noOfDays;
	private String boardingPoint;
	private String destination;
	private String driverName;
	private String driverPhNo;
	
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverPhNo() {
		return driverPhNo;
	}
	public void setDriverPhNo(String driverPhNo) {
		this.driverPhNo = driverPhNo;
	}
	public String getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(String noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	
	
	

}
