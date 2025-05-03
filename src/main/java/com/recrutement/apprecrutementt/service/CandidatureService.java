package com.recrutement.apprecrutementt.service;

import com.recrutement.apprecrutementt.model.Candidature;
import com.recrutement.apprecrutementt.model.Candidat;
import com.recrutement.apprecrutementt.model.OffreEmploi;

import java.util.List;

public interface CandidatureService {
    Candidature saveCandidature(Candidature candidature);
    Candidature getCandidatureById(Long id);
    List<Candidature> getAllCandidatures();
    void deleteCandidature(Long id);

    // ➕ Ajouts pour le formulaire
    List<Candidat> getAllCandidats();
    List<OffreEmploi> getAllOffresEmploi();
}
