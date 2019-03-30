package com.worldrestaurants.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worldrestaurants.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

	
}
