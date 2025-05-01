package com.recrutement.apprecrutementt.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class OffreEmploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private LocalDate datePublication;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "offreEmploi", cascade = CascadeType.ALL)
    private List<Candidature> candidatures;

    // Constructeurs, getters et setters
}
