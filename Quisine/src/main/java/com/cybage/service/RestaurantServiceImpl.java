package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Fooditems;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;
import com.cybage.repository.RestaurantRepository;
@Service
public class RestaurantServiceImpl implements RestaurantService{

	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Override
	public void saveRestaurant(Restaurant restaurant) {
		restaurantRepository.saveRestaurant(restaurant);
		
	}
	@Override
	public boolean checkLoginCredentials(String restaurantName, String restaurantPassword) {
		return restaurantRepository.checkLoginCredentials(restaurantName, restaurantPassword);
		
	}
	@Override
	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.getAllRestaurants();
	}
	@Override
	public Restaurant fetchByUsername(String username) {
		return (Restaurant) restaurantRepository.fetchByUsername(username);
	}
	@Override
	public boolean checkIfEmailExists(String email) {
		return restaurantRepository.checkIfEmailExists(email);
	}
	@Override
	public void saveFoodItems(Fooditems foodItems) {
		restaurantRepository.saveFoodItems(foodItems);
		
	}
	@Override
	public List<Fooditems> getAllFoodItems() {
		return restaurantRepository.getAllFoodItems();

	}
	/*
	 * @Override public int getFoodId(String name) { return
	 * restaurantRepository.getFoodId(name);
	 * 
	 * }
	 */

	
	  @Override public Fooditems getFoodItemById(int foodId) { return
	  restaurantRepository.getFoodItemById(foodId);
	  
	  }
	 
	@Override
	public void saveRestaurantFood(RestaurantFood restaurantFood) {
		restaurantRepository.saveRestaurantFood(restaurantFood);
		
	}
	@Override
	public void deleteRestaurantFood(int id) {
		restaurantRepository.deleteRestaurantFood(id);
		
	}
	@Override
	public List<RestaurantFood> getRestaurantFoodByRid(int restId) {
		return restaurantRepository.getRestaurantFoodByRid(restId);

	}
	@Override
	public Restaurant getRestaurantById(int id) {
		return restaurantRepository.getRestaurantById(id);
	}
	@Override
	public RestaurantFood getFoodPrice(Restaurant rest, Fooditems food) {
		
		return restaurantRepository.getFoodPrice(rest, food);
	}
	@Override
	public Fooditems getFoodByName(String name) {
		// TODO Auto-generated method stub
		return restaurantRepository.getFoodByName(name);
	}
	
	
	
	
}
