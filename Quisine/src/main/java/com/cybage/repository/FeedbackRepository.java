package com.cybage.repository;

import java.util.List;

import com.cybage.model.Feedback;

public interface FeedbackRepository {
	public void persistfeedback(Feedback feedback);

	public List<Feedback> getallFeed();
}
