package com.cybage.service;

import java.util.List;

import com.cybage.model.Feedback;

public interface FeedbackServices {
	public void persistfeedback(Feedback feedback) ;
	
	public List<Feedback> getallFeed();
}
