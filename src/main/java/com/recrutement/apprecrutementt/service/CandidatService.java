package com.recrutement.apprecrutementt.service;

import com.recrutement.apprecrutementt.model.Candidat;
import java.util.List;

public interface CandidatService {
    Candidat saveCandidat(Candidat candidat);
    Candidat getCandidatById(Long id);
    List<Candidat> getAllCandidats();
    void deleteCandidat(Long id);
}
