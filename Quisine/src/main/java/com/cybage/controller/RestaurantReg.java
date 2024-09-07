package com.cybage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.algorithm.EncryptionAlgorithm;
import com.cybage.model.FoodWithPrice;
import com.cybage.model.Fooditems;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;
import com.cybage.service.RestaurantService;

@Controller
public class RestaurantReg {
	@Autowired
	private RestaurantService restaurantService;

	@RequestMapping(value = "RestaurantRegisterRequest")
	public ModelAndView register(HttpServletResponse response, Model model) throws IOException {
		Restaurant restaurant = new Restaurant();
		model.addAttribute("rest", restaurant);

		return new ModelAndView("RestaurantRegister");
	}

	@RequestMapping("/addRestaurant")
	public ModelAndView registerRestaurant(@ModelAttribute("rest") Restaurant restaurant, Model model) {

		String email = restaurant.getRestEmail();

		// Check if the email already exists in the database
		if (restaurantService.checkIfEmailExists(email)) {

			model.addAttribute("errorMessage", "Email already exists. Please use a different email address.");
			return new ModelAndView("RestaurantRegister");
		} else {
			
			EncryptionAlgorithm algo = new EncryptionAlgorithm();
			String ecryptedPass = algo.encryptAlgorithm(restaurant.getRestPassword());
			
			restaurant.setRestPassword(ecryptedPass);
			restaurantService.saveRestaurant(restaurant);
			return new ModelAndView("Login");
		}
	}

	@RequestMapping(value = "restaurant-dashboard-add_food_items")
	public ModelAndView add_food_items(HttpServletResponse response, HttpServletRequest request, Model model)
			throws IOException {

		Fooditems foodItems = new Fooditems();
		model.addAttribute("food", foodItems);

		return new ModelAndView("restaurant-dashboard-add_food_items");
	}

	@RequestMapping(value = "addFoodItems")
	public ModelAndView addFoodItems(HttpServletRequest request, @ModelAttribute("food") Fooditems foodItems,
			Model model, @RequestParam("foodprice") float price) throws IOException {

		HttpSession httpSession = request.getSession(false);
		if (httpSession != null) {
			Restaurant restaurant = (Restaurant) httpSession.getAttribute("rest");
			if (restaurant != null) {
				// Persist FoodItems first
				Fooditems item = restaurantService.getFoodByName(foodItems.getFoodName());
				RestaurantFood restaurantFood = new RestaurantFood();
				
				if(item == null) {

					restaurantService.saveFoodItems(foodItems);
	
					// Create RestaurantFood instance to represent the relationship
					restaurantFood.setFoodItems(foodItems);
				}
				
				else {
					
					restaurantFood.setFoodItems(item);
				}
				
				restaurantFood.setRestaurant(restaurant);
				restaurantFood.setFoodprice(price);
				// Persist RestaurantFood
				restaurantService.saveRestaurantFood(restaurantFood);

//				List<Fooditems> foods = new ArrayList<>();
				List<FoodWithPrice> foods = new ArrayList<>();
				List<RestaurantFood> restaurantFoods = restaurantService.getRestaurantFoodByRid(restaurant.getRestId());
				for (RestaurantFood restaurantFood1 : restaurantFoods) {

					if (restaurantFood1.getRestaurant().equals(restaurant)) {
//						foods.add(restaurantFood1.getFoodItems());
						FoodWithPrice foodWithPrice = new FoodWithPrice();
						foodWithPrice.setFooditems(restaurantFood1.getFoodItems());
						foodWithPrice.setPrice(restaurantFood1.getFoodprice());
						
						foods.add(foodWithPrice);
					}
				}

				model.addAttribute("fooditem", foods);
				model.addAttribute("restaurant", restaurant);
				return new ModelAndView("RestaurantDashboard");
			}
		}
		return new ModelAndView("Restaurantlogin");

	}

	@RequestMapping(value = "Restaurantlogin")
	public ModelAndView login(HttpServletResponse response) throws IOException {
		return new ModelAndView("Restaurantlogin");
	}

	@RequestMapping(value = "user-dashboard")
	public ModelAndView user_dashboard(HttpServletResponse response) throws IOException {
		return new ModelAndView("user-dashboard");
	}

	@RequestMapping(value = "restaurant-dashboard")
	public ModelAndView restaurant_dashboard(HttpServletResponse response) throws IOException {
		return new ModelAndView("RestaurantDashboard");
	}

	@RequestMapping(value = "logout")
	public ModelAndView logout(HttpServletResponse response, HttpServletRequest request) throws IOException {
		
		HttpSession httpSession = request.getSession(false);
		httpSession.setAttribute("rest",null);
		httpSession.invalidate();
		
		return new ModelAndView("Login");
	}

	@RequestMapping(value = "deleteFoodItem")
	public ModelAndView deleteFoodItem(@RequestParam("fid") int fid, HttpServletRequest request,
			HttpServletResponse response, Model model) throws IOException {
		/*
		 * int id = restaurantService.getFoodId(request.getParameter("foodName"));
		 */

		System.out.println("Id to be deleted" + fid);
		restaurantService.deleteRestaurantFood(fid);

		HttpSession httpSession = request.getSession(false);
		if (httpSession != null) {
			Restaurant restaurant = (Restaurant) httpSession.getAttribute("rest");
			if (restaurant != null) {
				List<FoodWithPrice> foods = new ArrayList<>();
				List<RestaurantFood> restaurantFoods = restaurantService.getRestaurantFoodByRid(restaurant.getRestId());
				for (RestaurantFood restaurantFood1 : restaurantFoods) {

					if (restaurantFood1.getRestaurant().equals(restaurant)) {

						FoodWithPrice foodWithPrice = new FoodWithPrice();
						foodWithPrice.setFooditems(restaurantFood1.getFoodItems());
						foodWithPrice.setPrice(restaurantFood1.getFoodprice());
						
						foods.add(foodWithPrice);
					}
				}

				model.addAttribute("fooditem", foods);
				model.addAttribute("restaurant", restaurant);
//	            model.addAttribute("foodItems",foodItems);
				return new ModelAndView("RestaurantDashboard");
			}
		}
		// Handle if restaurant or session is null
		return new ModelAndView("redirect:/Restaurantlogin");

	}

	@RequestMapping(value = "viewAllFoodItems")
	public ModelAndView viewAllFoodItems(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {
		HttpSession httpSession = request.getSession(false);
		if (httpSession != null) {
			Restaurant restaurant = (Restaurant) httpSession.getAttribute("rest");
			if (restaurant != null) {
				List<Fooditems> allFoodItems = restaurantService.getAllFoodItems();
				List<RestaurantFood> restaurantFoodItems = restaurantService
						.getRestaurantFoodByRid(restaurant.getRestId());
				List<Fooditems> missingFoodItems = new ArrayList<>();

				for (Fooditems foodItem : allFoodItems) {
					boolean found = false;
					for (RestaurantFood restaurantFood : restaurantFoodItems) {
						if (restaurantFood.getFoodItems().getFoodId() == foodItem.getFoodId()) {
							found = true;
							break;
						}
					}
					if (!found) {
						missingFoodItems.add(foodItem);
					}
				}

				model.addAttribute("missingFoodItems", missingFoodItems);
				model.addAttribute("restaurant", restaurant);
				return new ModelAndView("view-all-food-items");
			}
		}

		return new ModelAndView("redirect:/Restaurantlogin");
	}

	@RequestMapping(value = "addItemToRestaurant")
	public ModelAndView addItemToRestaurant(@RequestParam("foodId") int foodId, HttpServletRequest request,
			HttpServletResponse response, Model model) throws IOException {
		HttpSession httpSession = request.getSession(false);
		if (httpSession != null) {
			Restaurant restaurant = (Restaurant) httpSession.getAttribute("rest");
			Fooditems foodItems = (Fooditems) restaurantService.getFoodItemById(foodId);
			if (restaurant != null) {
				// Logic to add the food item to the restaurant's menu
				RestaurantFood restaurantFood = new RestaurantFood();
				restaurantFood.setRestaurant(restaurant);
				restaurantFood.setFoodItems(foodItems);
				restaurantService.saveRestaurantFood(restaurantFood);

				List<Fooditems> foods = new ArrayList<>();
				List<RestaurantFood> restaurantFoods = restaurantService.getRestaurantFoodByRid(restaurant.getRestId());
				for (RestaurantFood restaurantFood1 : restaurantFoods) {

					if (restaurantFood1.getRestaurant().equals(restaurant)) {
						foods.add(restaurantFood1.getFoodItems());
					}
				}
//	            restaurantService.addFoodItemToRestaurant(restaurant.getRestId(), foodId);
				model.addAttribute("fooditem", foods);
				model.addAttribute("restaurant", restaurant);
				return new ModelAndView("RestaurantDashboard");
			}
		}
		// Handle if restaurant or session is null
		return new ModelAndView("redirect:/Restaurantlogin");

	}
}
