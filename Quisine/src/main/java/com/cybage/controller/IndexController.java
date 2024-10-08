package com.cybage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.algorithm.EncryptionAlgorithm;
import com.cybage.model.Customer;
import com.cybage.model.Feedback;
import com.cybage.model.FoodWithPrice;
import com.cybage.model.Fooditems;
import com.cybage.model.Orders;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;
import com.cybage.service.CustomerService;
import com.cybage.service.FeedbackServices;
import com.cybage.service.RestaurantService;

@Controller
public class IndexController {
	@Autowired
	private RestaurantService restaurantService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private FeedbackServices feedbackServices;
	
	@RequestMapping(value = "/")
	public ModelAndView Index(HttpServletResponse response, Model model) throws IOException {

		List<Restaurant> restaurants = restaurantService.getAllRestaurants();
		model.addAttribute("allrest", restaurants);
		List<Fooditems> fooditems = restaurantService.getAllFoodItems();
		model.addAttribute("allfood", fooditems);

		return new ModelAndView("Index");
	}

	@GetMapping("/restaurants")
	public ModelAndView showRestaurantsPage(HttpServletResponse response, Model model) {
		List<Restaurant> restaurantss = restaurantService.getAllRestaurants();
		model.addAttribute("showrest", restaurantss);
		return new ModelAndView("restaurants");
	}

	@GetMapping("/orders")
	public ModelAndView showorderPage(HttpServletResponse response, Model model) {
		List<Orders> order = customerService.getOrdersData();
		model.addAttribute("allorders", order);

		return new ModelAndView("orders");
	}
	
	@GetMapping("/feedbacks")
	public ModelAndView showfeedbackPage(HttpServletResponse response, Model model) {
		List<Feedback> custfeed = feedbackServices.getallFeed();
		model.addAttribute("allfeed", custfeed);
		return new ModelAndView("feedbacks");
	}

	@GetMapping("/users")
	public ModelAndView showSalesPage(HttpServletResponse response, Model model) {
		List<Customer> user = customerService.getUSerData();
		model.addAttribute("allusers", user);
		return new ModelAndView("users");
	}

	@RequestMapping("/loginPageRequest")
	public ModelAndView loginPageRequest() {

		return new ModelAndView("Login");
	}

	@RequestMapping("/loginRequest")
	public ModelAndView loginPage(@RequestParam("email") String email, @RequestParam("pass") String pass, Model model,
			HttpServletRequest request) {


		EncryptionAlgorithm algo = new EncryptionAlgorithm();
		if (email.equals("admin@mail.com") && pass.equals("admin1234")) {
			List<Orders> order = customerService.getOrdersData();
			model.addAttribute("allorders", order);
			List<Customer> user = customerService.getUSerData();
			model.addAttribute("allusers", user);
			List<Restaurant> restaurantss = restaurantService.getAllRestaurants();
			model.addAttribute("showrest", restaurantss);
			List<Feedback> custfeed = feedbackServices.getallFeed();
			model.addAttribute("allfeed", custfeed);
			Map<String, Integer> orderCountsByDate = customerService.getOrderCountsByDate();
			model.addAttribute("ordercount", orderCountsByDate);
			
			return new ModelAndView("adminDashboard");
		}

		else if (customerService.isCustomerExist(email)) {

			Customer customer = customerService.loginCustomer(email, algo.encryptAlgorithm(pass));

			if (customer != null) {

				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("cust_name", customer.getCustName());
				httpSession.setAttribute("cust_id", customer.getCustId());

				model.addAttribute("restaurants", restaurantService.getAllRestaurants());
				return new ModelAndView("CustomerDashboard");
			}
			

		}

		else if (restaurantService.checkLoginCredentials(email, algo.encryptAlgorithm(pass))) {

			Restaurant restaurant = restaurantService.fetchByUsername(email);

			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("rest", restaurant);
			String username = restaurant.getRestEmail();
			List<FoodWithPrice> foods = new ArrayList<>();
			List<RestaurantFood> restaurantFoods = restaurantService.getRestaurantFoodByRid(restaurant.getRestId());
			for (RestaurantFood restaurantFood : restaurantFoods) {

				if (restaurantFood.getRestaurant().equals(restaurant)) {
//					foods.add(restaurantFood.getFoodItems());
					FoodWithPrice foodWithPrice = new FoodWithPrice();
					foodWithPrice.setFooditems(restaurantFood.getFoodItems());
					foodWithPrice.setPrice(restaurantFood.getFoodprice());

					foods.add(foodWithPrice);
				}
			}
			model.addAttribute("fooditem", foods);
			httpSession.setAttribute("username", username);
			model.addAttribute("restaurant", restaurant);
			return new ModelAndView("RestaurantDashboard");
		}

		model.addAttribute("errorMessage", "Incorrect username or password. Please try again.");
		return new ModelAndView("Login");
	}
	@RequestMapping(value = "backtoadmin")
	public ModelAndView backtoadmin(Model model) {
		
		List<Orders> order = customerService.getOrdersData();
		model.addAttribute("allorders", order);
		List<Customer> user = customerService.getUSerData();
		model.addAttribute("allusers", user);
		List<Restaurant> restaurantss = restaurantService.getAllRestaurants();
		model.addAttribute("showrest", restaurantss);
		List<Feedback> custfeed = feedbackServices.getallFeed();
		model.addAttribute("allfeed", custfeed);
		Map<String, Integer> orderCountsByDate = customerService.getOrderCountsByDate();
		model.addAttribute("ordercount", orderCountsByDate);
		return new ModelAndView("adminDashboard");
	}

}
