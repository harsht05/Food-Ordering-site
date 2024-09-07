package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class RestaurantFood {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int frid;
	
	@ManyToOne
	@JoinColumn(name = "rest_id")
	private Restaurant restaurant;
	
	@ManyToOne
	@JoinColumn(name = "food_id")
	private Fooditems foodItems;

	private Float foodprice;
}
