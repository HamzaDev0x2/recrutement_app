package com.recrutement.apprecrutementt.controller;
import com.recrutement.apprecrutementt.model.Candidature;
import com.recrutement.apprecrutementt.model.Feedback;
import com.recrutement.apprecrutementt.service.FeedbackService;
import com.recrutement.apprecrutementt.service.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping
    public String listeFeedbacks(Model model) {
        List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
        model.addAttribute("feedbacks", feedbacks);
        return "feedbacks/liste";
    }

    @Autowired
    private CandidatureService candidatureService;

    @GetMapping("/ajouter")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("feedback", new Feedback());
        model.addAttribute("candidatures", candidatureService.getAllCandidatures());
        return "feedbacks/formulaire";
    }


    @PostMapping("/ajouter")
    public String enregistrerFeedback(@ModelAttribute Feedback feedback, @RequestParam Long candidature) {
        Candidature c = candidatureService.getCandidatureById(candidature);
        feedback.setCandidature(c);
        feedbackService.saveFeedback(feedback);
        return "redirect:/feedbacks";
    }


    @GetMapping("/{id}")
    public String voirFeedback(@PathVariable Long id, Model model) {
        Feedback feedback = feedbackService.getFeedbackById(id);
        model.addAttribute("feedback", feedback);
        return "feedbacks/details";
    }
}
