package com.cybage.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "loginProcess")
	public ModelAndView login(HttpServletResponse response) throws IOException {
		return new ModelAndView("login");
		
	}

	@RequestMapping(value = "signup")
	public ModelAndView signup(HttpServletResponse response) throws IOException {
		return new ModelAndView("signup");

	}
	
	@RequestMapping(value = "admin")
	public ModelAndView admin(HttpServletResponse response) throws IOException {
		return new ModelAndView("adminDashboard");
		
	}
	

}
