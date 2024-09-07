package com.cybage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Customer;
import com.cybage.model.Feedback;
import com.cybage.service.CustomerService;
import com.cybage.service.FeedbackServices;



@Controller
public class FeedbackController {
	@Autowired
	FeedbackServices feedbackServices;
		
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value="/feedbackload")
	public ModelAndView feedbackLoad(HttpServletResponse response,HttpServletRequest request,Model model) {
		HttpSession session =request.getSession(false);
		int cust_id = (int) session.getAttribute("cust_id");
		Customer customer= customerService.getCustomerById(cust_id);
		model.addAttribute("name", customer.getCustName());
		model.addAttribute("email", customer.getCustEmail());
		return new ModelAndView("customerfeedback");
		
	}


		@RequestMapping(value="/feedback")
		public String feedback(HttpServletResponse response,HttpServletRequest request) {
			Feedback feedback=new Feedback();
			feedback.setUsername( request.getParameter("name"));
			feedback.setUser_email(request.getParameter("email"));
			feedback.setFeedback_desc(request.getParameter("description"));
			feedback.setExperince(request.getParameter("like"));
			feedback.setRecommend(Integer.parseInt(request.getParameter("recommend")));
			
			feedbackServices.persistfeedback(feedback);
			return "redirect:/backToDashboard";
	}
		@RequestMapping(value="/dashboard")	
		public String skip(HttpServletResponse response,HttpServletRequest request) {
			return "redirect:/backToDashboard";}

}
	

