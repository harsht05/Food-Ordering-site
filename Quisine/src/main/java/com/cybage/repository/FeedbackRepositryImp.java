package com.cybage.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cybage.model.Feedback;


@Repository
public class FeedbackRepositryImp implements FeedbackRepository {
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	@Override
	public void persistfeedback(Feedback feedback) {
	entityManager.persist(feedback);

	}

	@Override
	@Transactional
	public List<Feedback> getallFeed() {
		Query query = entityManager.createQuery("select f FROM Feedback f");
		List<Feedback>list=query.getResultList();
		return list;	
	}

	

}
