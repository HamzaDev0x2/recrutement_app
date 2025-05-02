package com.recrutement.apprecrutementt.controller;

import com.recrutement.apprecrutementt.model.Candidat;
import com.recrutement.apprecrutementt.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/candidats")
public class CandidatController {

    @Autowired
    private CandidatService candidatService;

    @GetMapping
    public String listeCandidats(Model model) {
        List<Candidat> candidats = candidatService.getAllCandidats();
        model.addAttribute("candidats", candidats);
        return "candidats/liste"; // src/main/resources/templates/candidats/liste.html
    }

    @GetMapping("/ajouter")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("candidat", new Candidat());
        return "candidats/formulaire";
    }

    @PostMapping("/ajouter")
    public String enregistrerCandidat(@ModelAttribute Candidat candidat) {
        candidatService.saveCandidat(candidat);
        return "redirect:/candidats";
    }

    @GetMapping("/{id}")
    public String voirCandidat(@PathVariable Long id, Model model) {
        Candidat candidat = candidatService.getCandidatById(id);
        model.addAttribute("candidat", candidat);
        return "candidats/details";
    }
}
