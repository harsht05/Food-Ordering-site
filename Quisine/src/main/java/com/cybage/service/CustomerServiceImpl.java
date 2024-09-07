package com.cybage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Customer;
import com.cybage.model.Fooditems;
import com.cybage.model.Orders;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;
/*import com.cybage.model.Food;
import com.cybage.model.FoodRestaurent;
import com.cybage.model.Orders;
import com.cybage.model.Restaurent;*/
import com.cybage.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void registerCustomer(Customer customer) {

		System.out.println("In Service");
		customerRepository.registerCustomer(customer);
	}

	public Customer loginCustomer(String email, String pass) {

		return customerRepository.loginCustomer(email, pass);
	}

	public Customer getCustomerById(int id) {

		return customerRepository.getCustomerById(id);
	}

	public void addOrderDetails(Orders order) {

		customerRepository.addOrderDetails(order);
	}

	public List<Orders> getOrdersByCustomerId(Customer customer) {

		return customerRepository.getOrdersByCustomerId(customer);
	}

	public void updateCustomer(Customer customer) {

		customerRepository.updateCustomer(customer);
	}

	public List<RestaurantFood> getFoodRestaurantByRid() {

		return customerRepository.getFoodRestaurantByRid();
	}

	@Override
	public List<Fooditems> getAllFood() {
		return customerRepository.getAllFood();

	}

	@Override
	public Fooditems getFoodById(int id) {
		return customerRepository.getFoodById(id);

	}

	@Override
	public Fooditems getFoodByName(String name) {
		return customerRepository.getFoodByName(name);

	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return customerRepository.getAllRestaurents();

	}

	@Override
	public Restaurant getRestaurantById(int id) {
		return customerRepository.getRestaurentById(id);

	}
	@Override
	public void updateCustomerPassword(String email, String password) {
		
		customerRepository.updateCustomerPassword(email, password);
	}

	@Override
	public boolean isCustomerExist(String email) {

		return customerRepository.isCustomerExist(email);
	}

	@Override
	public List<Customer> getUSerData() {
		
		return customerRepository.getUserData();
	}

	@Override
	public List<Orders> getOrdersData() {
		return customerRepository.getOrdersData();
	}

	 public void OrderServiceImpl(CustomerRepository customerRepository) {
	        this.customerRepository = customerRepository;
	    }

	    @Override
	    public Map<String, Integer> getOrderCountsByDate() {
	        return customerRepository.getOrderCountsByDate();
	    }
	

}
