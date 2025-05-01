package com.recrutement.apprecrutementt.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String secteur;
    private String email;
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL)
    private List<OffreEmploi> offres;

    // Constructeurs, getters et setters
}
