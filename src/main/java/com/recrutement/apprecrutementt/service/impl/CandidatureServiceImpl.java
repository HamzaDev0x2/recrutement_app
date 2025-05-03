package com.recrutement.apprecrutementt.service.impl;

import com.recrutement.apprecrutementt.model.Candidature;
import com.recrutement.apprecrutementt.model.Candidat;
import com.recrutement.apprecrutementt.model.OffreEmploi;
import com.recrutement.apprecrutementt.repository.CandidatureRepository;
import com.recrutement.apprecrutementt.repository.CandidatRepository;
import com.recrutement.apprecrutementt.repository.OffreEmploiRepository;
import com.recrutement.apprecrutementt.service.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatureServiceImpl implements CandidatureService {

    @Autowired
    private CandidatureRepository candidatureRepository;

    @Autowired
    private CandidatRepository candidatRepository;

    @Autowired
    private OffreEmploiRepository offreEmploiRepository;

    @Override
    public Candidature saveCandidature(Candidature candidature) {
        return candidatureRepository.save(candidature);
    }

    @Override
    public Candidature getCandidatureById(Long id) {
        return candidatureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Candidature> getAllCandidatures() {
        return candidatureRepository.findAll();
    }

    @Override
    public void deleteCandidature(Long id) {
        candidatureRepository.deleteById(id);
    }

    @Override
    public List<Candidat> getAllCandidats() {
        return candidatRepository.findAll();
    }

    @Override
    public List<OffreEmploi> getAllOffresEmploi() {
        return offreEmploiRepository.findAll();
    }
}
