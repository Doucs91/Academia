package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class Note {
    @Id
    @GeneratedValue
    private UUID id;
    private double valeur;

    @ManyToOne
    private Examen examen;

    @ManyToOne
    private Eleve eleve;
}
