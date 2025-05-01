package com.recrutement.apprecrutementt.service;

import com.recrutement.apprecrutementt.model.Candidature;
import java.util.List;

public interface CandidatureService {
    Candidature saveCandidature(Candidature candidature);
    Candidature getCandidatureById(Long id);
    List<Candidature> getAllCandidatures();
    void deleteCandidature(Long id);
}
