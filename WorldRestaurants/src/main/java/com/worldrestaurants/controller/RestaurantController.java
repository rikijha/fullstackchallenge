package com.worldrestaurants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldrestaurants.model.Restaurant;
import com.worldrestaurants.repo.RestaurantRepository;

@RestController
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;

	@GetMapping("/restaurants")
	public List<Restaurant> getAll(){
		return restaurantRepository.findAll();
	}
}
