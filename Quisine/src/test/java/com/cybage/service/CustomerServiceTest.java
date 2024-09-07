package com.cybage.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cybage.model.Customer;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/SpringDispatcher-servlet.xml")
@WebAppConfiguration
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void myServiceTest() {
        System.out.println("TEST CASE 1");
        Customer cust = new Customer();
        cust.setCustEmail("harsh23@gmail.com");
        cust.setCustPass("Har@1234");
        cust.setCustName("Harsh");
        cust.setCustContact("9876543217");
        cust.setCustState("MH");
        cust.setCustPin(400070);
        cust.setCustCity("MUM");

        try {
            customerService.registerCustomer(cust);
            // If no exception is thrown, assert true
            Assert.assertTrue(true);
        } catch (Exception e) {
            // If an exception is thrown, fail the test and print the stack trace
            e.printStackTrace();
            Assert.fail("Should not throw exception for valid Customer");
        }
    }
 
    @Test
    public void myServiceTest1() {
    	System.out.println("TEST CASE 1");
    	Customer cust = new Customer();
   
    	
    	try {
    		customerService.registerCustomer(null);
    		// If no exception is thrown, assert true
    		Assert.assertTrue(true);
    	} catch (Exception e) {
    		// If an exception is thrown, fail the test and print the stack trace
    		e.printStackTrace();
    		Assert.fail("Should throw IllegalArgumentException for null Customer register");
    	}
    }
  
}