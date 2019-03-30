package com.worldrestaurants.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {

	@Id
	private long Restaurant_ID;
	private String Restaurant_Name;
	private String Cuisines;
	private String Average_Cost_for_two;
	private String Currency;
	private String Has_Table_booking;
	private String Has_Online_delivery;
	private String Aggregate_rating;
	private String Rating_color;
	private String Rating_text;
	private String Votes;

	public long getRestaurant_ID() {
		return Restaurant_ID;
	}

	public void setRestaurant_ID(long restaurant_ID) {
		Restaurant_ID = restaurant_ID;
	}

	public String getRestaurant_Name() {
		return Restaurant_Name;
	}

	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}

	public String getCuisines() {
		return Cuisines;
	}

	public void setCuisines(String cuisines) {
		Cuisines = cuisines;
	}

	public String getAverage_Cost_for_two() {
		return Average_Cost_for_two;
	}

	public void setAverage_Cost_for_two(String average_Cost_for_two) {
		Average_Cost_for_two = average_Cost_for_two;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getHas_Table_booking() {
		return Has_Table_booking;
	}

	public void setHas_Table_booking(String has_Table_booking) {
		Has_Table_booking = has_Table_booking;
	}

	public String getHas_Online_delivery() {
		return Has_Online_delivery;
	}

	public void setHas_Online_delivery(String has_Online_delivery) {
		Has_Online_delivery = has_Online_delivery;
	}

	public String getAggregate_rating() {
		return Aggregate_rating;
	}

	public void setAggregate_rating(String aggregate_rating) {
		Aggregate_rating = aggregate_rating;
	}

	public String getRating_color() {
		return Rating_color;
	}

	public void setRating_color(String rating_color) {
		Rating_color = rating_color;
	}

	public String getRating_text() {
		return Rating_text;
	}

	public void setRating_text(String rating_text) {
		Rating_text = rating_text;
	}

	public String getVotes() {
		return Votes;
	}

	public void setVotes(String votes) {
		Votes = votes;
	}

}
