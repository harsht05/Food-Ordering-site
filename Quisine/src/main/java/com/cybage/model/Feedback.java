package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "feedbackInfo")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fid;
	private String username;
	private String user_email;
	private String experince;
	private String feedback_desc;
	private int recommend;

}
