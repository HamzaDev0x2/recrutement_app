package com.recrutement.apprecrutementt.repository;

import com.recrutement.apprecrutementt.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    Feedback findByCandidatureId(Long candidatureId);
}
