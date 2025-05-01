package com.recrutement.apprecrutementt.service.impl;

import com.recrutement.apprecrutementt.model.Candidat;
import com.recrutement.apprecrutementt.repository.CandidatRepository;
import com.recrutement.apprecrutementt.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CandidatServiceImpl implements CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    @Override
    public Candidat saveCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public Candidat getCandidatById(Long id) {
        return candidatRepository.findById(id).orElse(null);
    }

    @Override
    public List<Candidat> getAllCandidats() {
        return candidatRepository.findAll();
    }

    @Override
    public void deleteCandidat(Long id) {
        candidatRepository.deleteById(id);
    }
}
