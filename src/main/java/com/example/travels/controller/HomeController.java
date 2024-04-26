package com.example.travels.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.travels.model.Trip;
import com.example.travels.service.TripService;

@Controller
public class HomeController {
	
	@Autowired
	private TripService tripService;

	@GetMapping("/")
	public String indexpage()
	{
		return "index";
	}
	
	@GetMapping("/trip/view")
	public String viewPage(Model model)
	{
		model.addAttribute("allTrips", tripService.showAllTrip());
		return "viewTrip";
	}
	
	@GetMapping("/trip/add")
	public String addPage(Model model)
	{
		model.addAttribute("obj", new Trip());
		return "add-trip";
	}
	
	@PostMapping("/trip/add")
	public String addTrip(@ModelAttribute("obj") Trip trip)
	{
		Optional<Trip> opt = tripService.searchTrip(trip.getTripId());
		if(opt.isEmpty())
		{
			tripService.addNewTrip(trip);
			return "redirect:/trip/view";
		}
		else
		{
			return "redirect:/trip/add?failed";
		}
	}
	@GetMapping("/trip/edit/{id}")
	public String editTrip(@PathVariable("id") String tripId, Model model)
	{
		model.addAttribute("obj", tripService.searchTrip(tripId));
		return "edit-trip";
	}
	@PostMapping("/trip/edit")
	public String editTrip(@ModelAttribute("obj") Trip trip)
	{
		tripService.addNewTrip(trip);
		return "redirect:/trip/view";
	}

	@GetMapping("/trip/delete/{id}")
	public String delteTrip(@PathVariable("id") String tripId)
	{
		tripService.deleteTrip(tripId);
		return "redirect:/trip/view";
	}
	
	
	
	
}
