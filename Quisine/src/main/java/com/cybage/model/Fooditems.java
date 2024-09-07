package com.cybage.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class Fooditems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foodId;
	private String foodName;
	private String foodImage;
	
}
