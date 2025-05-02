package com.recrutement.apprecrutementt.controller;

import com.recrutement.apprecrutementt.model.Entreprise;
import com.recrutement.apprecrutementt.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/entreprises")
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping
    public String listeEntreprises(Model model) {
        List<Entreprise> entreprises = entrepriseService.getAllEntreprises();
        model.addAttribute("entreprises", entreprises);
        return "entreprises/liste"; // /templates/entreprises/liste.html
    }

    @GetMapping("/ajouter")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("entreprise", new Entreprise());
        return "entreprises/formulaire";
    }

    @PostMapping("/ajouter")
    public String enregistrerEntreprise(@ModelAttribute Entreprise entreprise) {
        entrepriseService.saveEntreprise(entreprise);
        return "redirect:/entreprises";
    }

    @GetMapping("/{id}")
    public String voirEntreprise(@PathVariable Long id, Model model) {
        Entreprise entreprise = entrepriseService.getEntrepriseById(id);
        model.addAttribute("entreprise", entreprise);
        return "entreprises/details";
    }
}
