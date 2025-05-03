package com.recrutement.apprecrutementt.controller;

import com.recrutement.apprecrutementt.model.Candidature;
import com.recrutement.apprecrutementt.service.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/candidatures")
public class CandidatureController {

    @Autowired
    private CandidatureService candidatureService;

    @GetMapping
    public String listeCandidatures(Model model) {
        List<Candidature> candidatures = candidatureService.getAllCandidatures();
        model.addAttribute("candidatures", candidatures);
        return "candidatures/liste";
    }

    @GetMapping("/ajouter")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("candidature", new Candidature());
        model.addAttribute("candidats", candidatureService.getAllCandidats());
        model.addAttribute("offres", candidatureService.getAllOffresEmploi());
        return "candidatures/formulaire";
    }


    @PostMapping("/ajouter")
    public String enregistrerCandidature(@ModelAttribute Candidature candidature) {
        candidatureService.saveCandidature(candidature);
        return "redirect:/candidatures";
    }

    @GetMapping("/{id}")
    public String voirCandidature(@PathVariable Long id, Model model) {
        Candidature candidature = candidatureService.getCandidatureById(id);
        model.addAttribute("candidature", candidature);
        return "candidatures/details";
    }
}
