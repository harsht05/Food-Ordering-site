package com.cybage.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int restId;
	private String restName;
	private String restEmail;
	private String restPassword;
	private String restContact;
	private String restCity;
	private String restState;
	private String restPincode;

	private String restImage;
	
	

	
}
