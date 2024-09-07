package com.cybage.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.algorithm.EncryptionAlgorithm;
import com.cybage.algorithm.SendEmail;
import com.cybage.model.Customer;
import com.cybage.model.FoodWithPrice;
import com.cybage.model.Fooditems;
import com.cybage.model.Orders;
import com.cybage.model.Restaurant;
import com.cybage.model.RestaurantFood;
import com.cybage.model.Summary;
/*import com.cybage.model.Food;
import com.cybage.model.FoodRestaurent;
import com.cybage.model.Orders;
import com.cybage.model.Restaurent;
import com.cybage.model.Summary;*/
import com.cybage.service.CustomerService;
import com.cybage.service.RestaurantService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private RestaurantService restaurantService;

	@RequestMapping("/customerRegisterRequest")
	public ModelAndView loadLandingPage() {

		return new ModelAndView("SendOtp");
	}

	@PostMapping("/sendOtp")
	public ModelAndView sendOtpPageRequest(@RequestParam("cust_email") String cust_email, Model model) {

		if (customerService.isCustomerExist(cust_email)) {

			return new ModelAndView("Login");
		}

		SendEmail email = new SendEmail();
		Random random = new Random();

		int otp = random.nextInt(1000, 9999);
		if (email.sendOtpEmail(cust_email, otp)) {

			model.addAttribute("otp", otp);
			model.addAttribute("cust_email", cust_email);
			return new ModelAndView("VerifyOtp");
		}

		return new ModelAndView("SendOtp");
	}

	@RequestMapping("/verifyOtp")
	public ModelAndView verifyOtpPageRequest(@RequestParam("cust_email") String email, @RequestParam("otpw") int otpw,
			@RequestParam("otp") int otp, Model model) {

		if (otp == otpw) {

			model.addAttribute("email", email);
			model.addAttribute("cust", new Customer());
			return new ModelAndView("CustomerRegister");
		}
		model.addAttribute("errorMessage", "Incorrect OTP");
		return new ModelAndView("SendOtp");
	}

	@PostMapping("/registerCustomer")
	public ModelAndView registerCustomer(@ModelAttribute("cust") Customer customer) {

		EncryptionAlgorithm algo = new EncryptionAlgorithm();
		String encryptedPass = algo.encryptAlgorithm(customer.getCustPass());

		customer.setCustPass(encryptedPass);
		customerService.registerCustomer(customer);
		return new ModelAndView("Login");
	}

	@RequestMapping("/forgotPasswordRequest")
	public ModelAndView forgotPasswordPage() {

		return new ModelAndView("ForgotPassword");
	}

	@PostMapping("/sendOtpForPassword")
	public ModelAndView sendOtpPasswordRequest(@RequestParam("cust_email") String cust_email, Model model) {

		if (!customerService.isCustomerExist(cust_email)) {

			return new ModelAndView("SendOtp");
		}

		SendEmail email = new SendEmail();
		Random random = new Random();

		int otp = random.nextInt(1000, 9999);
		if (email.sendOtpEmail(cust_email, otp)) {

			model.addAttribute("otp", otp);
			model.addAttribute("cust_email", cust_email);
			return new ModelAndView("VerifyOtpPassword");
		}
		model.addAttribute("errorMessage", "Incorrect otp");
		return new ModelAndView("ForgotPassword");
	}

	@PostMapping("/verifyOtpPassword")
	public ModelAndView verifyOtpPagePassword(@RequestParam("cust_email") String email, @RequestParam("otpw") int otpw,
			@RequestParam("otp") int otp, @RequestParam("cust_pass") String cust_pass, Model model) {

		if (otp == otpw) {

			EncryptionAlgorithm algo = new EncryptionAlgorithm();
			customerService.updateCustomerPassword(email, algo.encryptAlgorithm(cust_pass));
			model.addAttribute("email", email);
			model.addAttribute("cust", new Customer());
			return new ModelAndView("Login");
		}

		return new ModelAndView("ForgotPassword");
	}

	@RequestMapping("/selectFoodPage")
	public ModelAndView selectFoodPage(@RequestParam("id") int rid, Model model, HttpServletRequest request) {

		HttpSession httpSession = request.getSession(false);
		httpSession.setAttribute("rest_id", rid);
		Restaurant restaurent = restaurantService.getRestaurantById(rid);

		List<FoodWithPrice> foods = new ArrayList<>();
		List<RestaurantFood> foodRestaurents = customerService.getFoodRestaurantByRid();

		for (RestaurantFood foodRestaurent : foodRestaurents) {

			if (foodRestaurent.getRestaurant().equals(restaurent)) {

				FoodWithPrice foodWithPrice = new FoodWithPrice();
				foodWithPrice.setFooditems(foodRestaurent.getFoodItems());
				foodWithPrice.setPrice(foodRestaurent.getFoodprice());

				foods.add(foodWithPrice);
			}
		}

		model.addAttribute("food_list", foods);
		model.addAttribute("rest_name", restaurent.getRestName());
		model.addAttribute("summary", new Summary());
		return new ModelAndView("SelectFood");
	}

	@RequestMapping("/payementSummaryPage")
	public ModelAndView payementSummaryPage(@ModelAttribute("summary") Summary summary, Model model,
			HttpServletRequest request) {

		HttpSession httpSession = request.getSession(false);
		httpSession.setAttribute("meals", summary.returnMeals());
		model.addAttribute("summary", summary);

		return new ModelAndView("PayementSummary");
	}

	@RequestMapping("/placeOrder")
	public ModelAndView placeOrderPage(HttpServletRequest request, Model model) {

		HttpSession httpSession = request.getSession(false);

		Customer customer = customerService.getCustomerById((int) httpSession.getAttribute("cust_id"));
		Restaurant restaurent = restaurantService.getRestaurantById((int) httpSession.getAttribute("rest_id"));

		Map<String, Integer> map = (Map<String, Integer>) httpSession.getAttribute("meals");
		List<Orders> orders = new ArrayList<>();

		StringBuffer messages = new StringBuffer();
		for (String key : map.keySet()) {

			Fooditems food = customerService.getFoodByName(key);
			if (map.get(key) > 0) {

				RestaurantFood rfood = restaurantService.getFoodPrice(restaurent, food);

				Orders order = new Orders();
				order.setDate(new Date());
				order.setCustomer(customer);
				order.setRestaurent(restaurent);
				order.setFood(food);
				order.setTotal_price(rfood.getFoodprice() * map.get(key));
				order.setQuantity(map.get(key));

				customerService.addOrderDetails(order);
				messages.append("Meal : " + food.getFoodName() + "\nRestaurent : " + restaurent.getRestName()
						+ "\nQuantity : " + map.get(key) + "\nPrice : " + order.getTotal_price()
						+ "\nOrder Date and Time : " + order.getDate() + "\n");
				
				messages.append("\n*******************\n");
				
				orders.add(order);
			}
		}

		SendEmail email = new SendEmail();
		email.sendOrderDetailsByEmail(customer.getCustEmail(), messages.toString());

		model.addAttribute("orders_list", orders);

		return new ModelAndView("PlaceOrder");
	}

	@RequestMapping("/backToDashboard")
	public ModelAndView backToDashboardPage(Model model) {

		model.addAttribute("restaurants", restaurantService.getAllRestaurants());
		return new ModelAndView("CustomerDashboard");
	}

	@RequestMapping("/ordersPage")
	public ModelAndView ordersPageRequest(HttpServletRequest request, Model model) {

		HttpSession httpSession = request.getSession(false);
		Customer customer = customerService.getCustomerById((int) httpSession.getAttribute("cust_id"));

		List<Orders> orders = customerService.getOrdersByCustomerId(customer);
		model.addAttribute("orders_list", orders);

		return new ModelAndView("ViewOrders");
	}

	@RequestMapping("/updateCustomerPage")
	public ModelAndView updateCustomerPageRequest(HttpServletRequest request, Model model) {

		HttpSession httpSession = request.getSession(false);
		Customer customer = customerService.getCustomerById((int) httpSession.getAttribute("cust_id"));

		model.addAttribute("cust", customer);

		return new ModelAndView("UpdateCustomer");
	}

	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(HttpServletRequest request, @ModelAttribute("cust") Customer customer,
			Model model) {

		HttpSession httpSession = request.getSession(false);
		int cid = (int) httpSession.getAttribute("cust_id");
		customer.setCustId(cid);

		customerService.updateCustomer(customer);
		model.addAttribute("cust", customer);

		return new ModelAndView("ViewCustomer");
	}

	@RequestMapping("/viewCustomerRequest")
	public ModelAndView viewCustomerDetails(HttpServletRequest request, Model model) {

		HttpSession httpSession = request.getSession(false);
		int cid = (int) httpSession.getAttribute("cust_id");

		model.addAttribute("cust", customerService.getCustomerById(cid));
		return new ModelAndView("ViewCustomer");
	}

	@PostMapping("/searchQuery")
	public ModelAndView executeSearchQuery(@RequestParam("query") String query,
			@RequestParam("filter_type") String filterType, Model model) {

		List<Restaurant> allRestaurants = customerService.getAllRestaurants();
		List<Restaurant> restaurants = new ArrayList<>();

		if (filterType.equals("rest_city")) {

			for (Restaurant rest : allRestaurants) {

				if (rest.getRestCity().toLowerCase().indexOf(query.toLowerCase()) != -1) {

					restaurants.add(rest);
				}
			}
		}

		else if (filterType.equals("rest_name")) {

			for (Restaurant rest : allRestaurants) {

				if (rest.getRestName().toLowerCase().indexOf(query.toLowerCase()) != -1) {

					restaurants.add(rest);
				}
			}
		}

		else {

			for (Restaurant rest : allRestaurants) {

				if (rest.getRestPincode().toLowerCase().indexOf(query.toLowerCase()) != -1) {

					restaurants.add(rest);
				}
			}
		}

		model.addAttribute("restaurants", restaurants);

		return new ModelAndView("QueryResult");
	}

	@RequestMapping("/logoutRequest")
	public ModelAndView logout(HttpServletRequest request) {

		HttpSession httpSession = request.getSession(false);
		httpSession.removeAttribute("cust_name");
		httpSession.removeAttribute("cust_id");
		httpSession.removeAttribute("rest_id");
		httpSession.removeAttribute("meals");
		httpSession.removeAttribute("total_price");
		httpSession.invalidate();

		return new ModelAndView("Login");
	}

}
