package com.cybage.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id; 

	private int quantity;
	private float total_price;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "rest_id")
	private Restaurant restaurent;
	
	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "food_id")
	private Fooditems food;
}
