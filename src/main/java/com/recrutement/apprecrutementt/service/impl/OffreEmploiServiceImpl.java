package com.recrutement.apprecrutementt.service.impl;

import com.recrutement.apprecrutementt.model.OffreEmploi;
import com.recrutement.apprecrutementt.repository.OffreEmploiRepository;
import com.recrutement.apprecrutementt.service.OffreEmploiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OffreEmploiServiceImpl implements OffreEmploiService {
    @Autowired
    private OffreEmploiRepository offreRepository;

    @Override
    public OffreEmploi saveOffre(OffreEmploi offre) {
        return offreRepository.save(offre);
    }

    @Override
    public OffreEmploi getOffreById(Long id) {
        return offreRepository.findById(id).orElse(null);
    }

    @Override
    public List<OffreEmploi> getAllOffres() {
        return offreRepository.findAll();
    }

    @Override
    public void deleteOffre(Long id) {
        offreRepository.deleteById(id);
    }
}
