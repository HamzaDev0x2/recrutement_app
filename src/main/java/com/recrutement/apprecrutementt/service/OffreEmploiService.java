package com.recrutement.apprecrutementt.service;

import com.recrutement.apprecrutementt.model.OffreEmploi;
import java.util.List;

public interface OffreEmploiService {
    OffreEmploi saveOffre(OffreEmploi offre);
    OffreEmploi getOffreById(Long id);
    List<OffreEmploi> getAllOffres();
    void deleteOffre(Long id);
}
