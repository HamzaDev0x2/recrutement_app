package com.recrutement.apprecrutementt.repository;

import com.recrutement.apprecrutementt.model.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Long> {
    List<Candidature> findByCandidatId(Long candidatId);
    List<Candidature> findByOffreEmploiId(Long offreId);
}
