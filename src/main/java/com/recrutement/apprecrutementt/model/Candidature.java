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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateCandidature() {
        return dateCandidature;
    }

    public void setDateCandidature(LocalDate dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public OffreEmploi getOffreEmploi() {
        return offreEmploi;
    }

    public void setOffreEmploi(OffreEmploi offreEmploi) {
        this.offreEmploi = offreEmploi;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    @ManyToOne
    @JoinColumn(name = "offre_id")
    private OffreEmploi offreEmploi;

    @OneToOne(mappedBy = "candidature", cascade = CascadeType.ALL)
    private Feedback feedback;

    // Constructeurs, getters et setters
}
