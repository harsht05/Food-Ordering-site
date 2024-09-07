package com.cybage.repository;

import java.util.List;
import java.util.Map;

import com.cybage.model.Customer;
import com.cybage.model.Fooditems;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;

public interface RestaurantRepository {

	void saveRestaurant(Restaurant restaurant);

	boolean checkLoginCredentials(String username, String userpassword);

	boolean checkIfEmailExists(String email);

	Restaurant fetchByUsername(String username);

	void saveFoodItems(Fooditems foodItems);

	List<Fooditems> getAllFoodItems();


	void saveRestaurantFood(RestaurantFood restaurantFood);

	void deleteRestaurantFood(int id);

	List<Restaurant> getAllRestaurants();

	List<RestaurantFood> getRestaurantFoodByRid(int restId);

	Fooditems getFoodItemById(int foodId);

	Restaurant getRestaurantById(int id);

	RestaurantFood getFoodPrice(Restaurant rest, Fooditems food);

	Fooditems getFoodByName(String name);
	




}
