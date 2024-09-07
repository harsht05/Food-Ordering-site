package com.cybage.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Summary {

	private String meal_charges;
	private String meals;
	private String total_price; 
	
	public float returnMealCharges() {
		
		return Float.parseFloat(getMeal_charges().substring(21));
	}
	
	public float returntotalPrice() {
		
		return Float.parseFloat(getTotal_price().substring(20));
	}
	
	public Map<String, Integer> returnMeals() {
		
		Map<String, Integer> map = new HashMap<>();
		
		String order = getMeals().substring(7);
		String[] parts = order.split(",| : ");
		
		for (String part : parts) {

		    String[] itemAndQuantity = part.trim().split("\\s*\\*\\s*");


		    String foodItem = itemAndQuantity[0];
		    int quantity = Integer.parseInt(itemAndQuantity[1]);

		    map.put(foodItem, quantity);
		}
		
		return map;
	}
}
