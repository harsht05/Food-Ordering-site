package com.cybage.repository;

import java.util.List;
import java.util.Map;

import com.cybage.model.Customer;
import com.cybage.model.Fooditems;
import com.cybage.model.RestaurantFood;
import com.cybage.model.Orders;
import com.cybage.model.Restaurant;

public interface CustomerRepository {

	void registerCustomer(Customer customer);

	Customer loginCustomer(String email, String pass);

	Customer getCustomerById(int id);

	List<Fooditems> getAllFood();

	Fooditems getFoodByName(String name);

	List<Restaurant> getAllRestaurents();

	Restaurant getRestaurentById(int id);

	Fooditems getFoodById(int id);

	void addOrderDetails(Orders order);

	List<Orders> getOrdersByCustomerId(Customer customer);

	void updateCustomer(Customer customer);

	List<RestaurantFood> getFoodRestaurantByRid();

	void updateCustomerPassword(String email, String password);

	boolean isCustomerExist(String email);

	List<Customer> getUserData();

	List<Orders> getOrdersData();

	Map<String, Integer> getOrderCountsByDate();
}
