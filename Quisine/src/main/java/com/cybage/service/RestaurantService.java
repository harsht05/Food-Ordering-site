package com.cybage.service;

import java.util.List;

import com.cybage.model.Fooditems;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;

public interface RestaurantService {
	
	void saveRestaurant(Restaurant restaurant);
	
	boolean checkLoginCredentials(String username, String userpassword);
	
	Restaurant fetchByUsername(String username);
	
	boolean checkIfEmailExists(String email);

	void saveFoodItems(Fooditems foodItems);

	List<Fooditems> getAllFoodItems();
	
	Fooditems getFoodItemById(int foodId);
	 	
	void saveRestaurantFood(RestaurantFood restaurantFood);
	
	
	void deleteRestaurantFood(int id);

	List<Restaurant> getAllRestaurants();

	List<RestaurantFood> getRestaurantFoodByRid(int restId);

	Restaurant getRestaurantById(int rid);

	RestaurantFood getFoodPrice(Restaurant rest, Fooditems food);
	
	Fooditems getFoodByName(String name);
}
