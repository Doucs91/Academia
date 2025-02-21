package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Cours {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDateTime horaire;
    private String salle;

    @ManyToOne
    private Matiere matiere;

    @ManyToOne
    private Professeur professeur;

    @ManyToOne
    private Classe classe;
}
