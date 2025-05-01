package com.recrutement.apprecrutementt.service;

import com.recrutement.apprecrutementt.model.Feedback;
import java.util.List;

public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);
    Feedback getFeedbackById(Long id);
    List<Feedback> getAllFeedbacks();
    void deleteFeedback(Long id);
}
