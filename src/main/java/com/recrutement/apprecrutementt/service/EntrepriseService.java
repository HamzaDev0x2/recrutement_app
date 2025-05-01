package com.recrutement.apprecrutementt.service;

import com.recrutement.apprecrutementt.model.Entreprise;
import java.util.List;

public interface EntrepriseService {
    Entreprise saveEntreprise(Entreprise entreprise);
    Entreprise getEntrepriseById(Long id);
    List<Entreprise> getAllEntreprises();
    void deleteEntreprise(Long id);
}
