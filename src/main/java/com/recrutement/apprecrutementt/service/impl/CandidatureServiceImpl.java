package com.recrutement.apprecrutementt.service.impl;

import com.recrutement.apprecrutementt.model.Candidature;
import com.recrutement.apprecrutementt.repository.CandidatureRepository;
import com.recrutement.apprecrutementt.service.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CandidatureServiceImpl implements CandidatureService {
    @Autowired
    private CandidatureRepository candidatureRepository;

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
}
