package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	
	private String custName;
	private String custEmail;
	private String custPass;
	private String custContact;
	private String custCity;
	private String custState;
	private int custPin;
}