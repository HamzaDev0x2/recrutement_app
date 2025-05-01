package com.recrutement.apprecrutementt.repository;

import com.recrutement.apprecrutementt.model.OffreEmploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OffreEmploiRepository extends JpaRepository<OffreEmploi, Long> {
    List<OffreEmploi> findByTitreContaining(String keyword);
}
