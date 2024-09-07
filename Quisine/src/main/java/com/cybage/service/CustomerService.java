package com.cybage.service;

import java.util.List;
import java.util.Map;

import com.cybage.model.Customer;
import com.cybage.model.Fooditems;
import com.cybage.model.RestaurantFood;
import com.cybage.model.Orders;
import com.cybage.model.Restaurant;

public interface CustomerService {

	void registerCustomer(Customer customer);

	Customer loginCustomer(String email, String pass);

	Customer getCustomerById(int id);

	void updateCustomerPassword(String email, String password);

	List<Fooditems> getAllFood();

	Fooditems getFoodById(int id);

	Fooditems getFoodByName(String name);

	List<Restaurant> getAllRestaurants();

	Restaurant getRestaurantById(int id);

	void addOrderDetails(Orders order);

	List<Orders> getOrdersByCustomerId(Customer customer);

	void updateCustomer(Customer customer);

	List<RestaurantFood> getFoodRestaurantByRid();

	boolean isCustomerExist(String email);

	List<Customer> getUSerData();

	List<Orders> getOrdersData();

	Map<String, Integer> getOrderCountsByDate();


}
