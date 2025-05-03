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

    public void setId(Long id) {
        this.id = id;
    }

    public void setOffres(List<OffreEmploi> offres) {
        this.offres = offres;
    }

    public String getNom() {
        return nom;
    }

    public List<OffreEmploi> getOffres() {
        return offres;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSecteur() {
        return secteur;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
