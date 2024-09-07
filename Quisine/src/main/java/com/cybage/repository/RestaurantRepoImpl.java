package com.cybage.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cybage.model.Customer;
import com.cybage.model.Fooditems;
import com.cybage.model.Orders;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;

@Repository
public class RestaurantRepoImpl implements RestaurantRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void saveRestaurant(Restaurant restaurant) {
		entityManager.persist(restaurant);
	}

	@Transactional
	public boolean checkLoginCredentials(String username, String userpassword) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery(
				"SELECT r FROM Restaurant r WHERE r.restEmail = :username AND r.restPassword = :userpassword");
		query.setParameter("username", username);
		query.setParameter("userpassword", userpassword);

		// Execute the query
		Restaurant restaurant = null;
		try {
			restaurant = (Restaurant) query.getSingleResult();
		} catch (Exception e) {
			// Handle exception (e.g., user not found)
			e.printStackTrace();
		}

		// Check if restaurant is found
		return restaurant != null;

	}

	@Transactional
	public List<Restaurant> getAllRestaurants() {
		Query query = entityManager.createQuery("SELECT r FROM Restaurant r");
		List<Restaurant> list = query.getResultList();
		return list;
	}

	@Transactional
	public boolean checkIfEmailExists(String email) {
		TypedQuery<Long> query = entityManager
				.createQuery("SELECT COUNT(r) FROM Restaurant r WHERE r.restEmail = :email", Long.class);
		query.setParameter("email", email);
		Long count = query.getSingleResult();
		return count > 0;
	}

	@Transactional
	public Restaurant fetchByUsername(String username) {
		Query query = entityManager.createQuery("SELECT r FROM Restaurant r WHERE r.restEmail = :username");
		query.setParameter("username", username);
		return (Restaurant) query.getSingleResult();
	}

	@Transactional
	public void saveFoodItems(Fooditems foodItems) {
		entityManager.persist(foodItems);

	}

	@Transactional
	public List<Fooditems> getAllFoodItems() {
		TypedQuery<Fooditems> query = entityManager.createQuery("SELECT f FROM Fooditems f", Fooditems.class);
		return query.getResultList();
	}

	@Transactional
	public Fooditems getFoodItemById(int foodId) {
		return entityManager.find(Fooditems.class, foodId);

	}

	@Transactional
	public void saveRestaurantFood(RestaurantFood restaurantFood) {
		entityManager.persist(restaurantFood);

	}

	@Transactional
	public void deleteRestaurantFood(int id) {
		Query query = entityManager.createQuery("DELETE FROM RestaurantFood rf WHERE rf.foodItems.foodId = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Transactional
	public List<RestaurantFood> getRestaurantFoodByRid(int restId) {
		Query query = entityManager.createQuery("SELECT r FROM RestaurantFood r WHERE r.restaurant.restId = :rest");
		query.setParameter("rest", restId);
		return query.getResultList();
	}

	@Override
	public Restaurant getRestaurantById(int id) {
		return entityManager.find(Restaurant.class, id);
	}

	@Transactional
	public RestaurantFood getFoodPrice(Restaurant rest, Fooditems food) {

		try {
			Query query = entityManager
					.createQuery("select rf from RestaurantFood rf where rf.restaurant = ?1 and rf.foodItems=?2");

			query.setParameter(1, rest);
			query.setParameter(2, food);

			RestaurantFood foodItem = (RestaurantFood) query.getSingleResult();

			return foodItem;
		} catch (NoResultException e) {

			return null; // Return false if no customer found with the given credentials
		}
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

	

}
