package com.recrutement.apprecrutementt.controller;

import com.recrutement.apprecrutementt.model.OffreEmploi;
import com.recrutement.apprecrutementt.service.OffreEmploiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/offres")
public class OffreEmploiController {

    @Autowired
    private OffreEmploiService offreService;

    @GetMapping
    public String listeOffres(Model model) {
        List<OffreEmploi> offres = offreService.getAllOffres();
        model.addAttribute("offres", offres);
        return "offres/liste";
    }

    @GetMapping("/ajouter")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("offre", new OffreEmploi());
        return "offres/formulaire";
    }

    @PostMapping("/ajouter")
    public String enregistrerOffre(@ModelAttribute OffreEmploi offre) {
        offreService.saveOffre(offre);
        return "redirect:/offres";
    }

    @GetMapping("/{id}")
    public String voirOffre(@PathVariable Long id, Model model) {
        OffreEmploi offre = offreService.getOffreById(id);
        model.addAttribute("offre", offre);
        return "offres/details";
    }
}
