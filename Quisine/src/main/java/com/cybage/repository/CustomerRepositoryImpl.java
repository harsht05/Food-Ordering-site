package com.cybage.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cybage.model.Customer;
import com.cybage.model.Fooditems;
import com.cybage.model.Orders;
import com.cybage.model.RestaurantFood;
import com.cybage.model.Restaurant;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void registerCustomer(Customer customer) {

		System.out.println("In Repo");
		entityManager.persist(customer);
	}

	@Transactional
	public Customer loginCustomer(String email, String pass) {

		try {
			Query query = entityManager
					.createQuery("select cust from Customer cust where cust.custEmail = ?1 and cust.custPass = ?2");

			query.setParameter(1, email);
			query.setParameter(2, pass);

			Customer customer = (Customer) query.getSingleResult();

			return customer;
		} catch (NoResultException e) {

			return null; // Return false if no customer found with the given credentials
		}
	}

	@Transactional
	public List<Fooditems> getAllFood() {

		System.out.println("In Repository");
		Query query = entityManager.createQuery("select f from Fooditems f");
		return query.getResultList();
	}

	@Transactional
	public List<Restaurant> getAllRestaurents() {

		System.out.println("In Repository");
		Query query = entityManager.createQuery("select r from Restaurant r");
		return query.getResultList();
	}

	@Transactional
	public Restaurant getRestaurentById(int id) {

		return entityManager.find(Restaurant.class, id);
	}

	@Transactional
	public Fooditems getFoodById(int id) {

		return entityManager.find(Fooditems.class, id);
	}

	@Transactional
	public Customer getCustomerById(int id) {

		return entityManager.find(Customer.class, id);
	}

	@Transactional
	public Fooditems getFoodByName(String name) {

		try {
			Query query = entityManager.createQuery("select f from Fooditems f where f.foodName = ?1");

			query.setParameter(1, name);

			Fooditems food = (Fooditems) query.getSingleResult();

			return food;
		} catch (NoResultException e) {

			return null; // Return false if no customer found with the given credentials
		}
	}
	
	  @Transactional public void addOrderDetails(Orders order) {
	  
	  entityManager.persist(order); }
	  
	  @Transactional public List<Orders> getOrdersByCustomerId(Customer customer) {
	  
		  Query query = entityManager.
		  createQuery("select o from Orders o where o.customer=?1 order by o.order_id desc"
		  ); query.setParameter(1, customer); return query.getResultList(); 
	  }
	 

	@Transactional
	public void updateCustomer(Customer customer) {

		System.out.println("In Repository");
		Query query = entityManager.createQuery(
				"update Customer c set c.custName=?1, c.custContact=?2, c.custCity=?3, c.custPin=?4 where c.custId=?5");

		query.setParameter(1, customer.getCustName());
		query.setParameter(2, customer.getCustContact());
		query.setParameter(3, customer.getCustCity());
		query.setParameter(4, customer.getCustPin());
		query.setParameter(5, customer.getCustId());

		query.executeUpdate();
	}

	@Transactional
	public List<RestaurantFood> getFoodRestaurantByRid() {

		Query query = entityManager.createQuery("select fr from RestaurantFood fr");
		return query.getResultList();
	}

	@Transactional
	public void updateCustomerPassword(String email, String password) {
		
		Query query = entityManager.createQuery("update Customer c set c.custPass=?1 where c.custEmail=?2");
		
		query.setParameter(1, password);
		query.setParameter(2, email);
		
		query.executeUpdate();
	}

	@Transactional
	public boolean isCustomerExist(String email) {

		try {
			Query query = entityManager
					.createQuery("select cust from Customer cust where cust.custEmail = ?1");

			query.setParameter(1, email);

			Customer customer = (Customer) query.getSingleResult();

			return customer != null;
		} catch (NoResultException e) {

			return false; // Return false if no customer found with the given credentials
		}
	}
	
	@Override
	@Transactional
	public List<Customer> getUserData() {

		Query query =entityManager.createQuery("select u from Customer u");
		List<Customer>list=query.getResultList();
		
		return list;
	}

	@Override
	@Transactional
	public List<Orders> getOrdersData() {
		
		Query query =entityManager.createQuery("select o from Orders o");
		List<Orders>list=query.getResultList();
		
		return list;	}
	
	@Override
	@Transactional
	public Map<String, Integer> getOrderCountsByDate() {
		List<Object[]> results = entityManager
				.createQuery(
						"SELECT Date(o.date) AS order_date, COUNT(*) AS order_count FROM Orders o GROUP BY Date(o.date)")
				.getResultList();

		Map<String, Integer> orderCountsByDate = new HashMap<>();
		for (Object[] result : results) {
			String date = result[0].toString();
			Integer count = ((Number) result[1]).intValue();
			orderCountsByDate.put(date, count);
		}
		return orderCountsByDate;
	}
	
	

}
