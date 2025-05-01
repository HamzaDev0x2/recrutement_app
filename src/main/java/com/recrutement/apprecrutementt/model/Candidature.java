package com.recrutement.apprecrutementt.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Candidature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCandidature;
    private String statut; // EN_ATTENTE, ACCEPTEE, REFUSEE

    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name = "offre_id")
    private OffreEmploi offreEmploi;

    @OneToOne(mappedBy = "candidature", cascade = CascadeType.ALL)
    private Feedback feedback;

    // Constructeurs, getters et setters
}
