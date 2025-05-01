package com.recrutement.apprecrutementt.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int note;
    private String commentaire;
    private LocalDate date;

    @OneToOne
    @JoinColumn(name = "candidature_id")
    private Candidature candidature;

    // Constructeurs, getters et setters
}
