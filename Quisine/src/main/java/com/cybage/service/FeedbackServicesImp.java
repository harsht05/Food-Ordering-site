package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Feedback;
import com.cybage.repository.FeedbackRepository;

@Service
public class FeedbackServicesImp implements FeedbackServices {
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@Override
	public void persistfeedback(Feedback feedback) {
		feedbackRepository.persistfeedback(feedback);

	}

	@Override
	public List<Feedback> getallFeed() {
		
		return feedbackRepository.getallFeed();
	}

}
