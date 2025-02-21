package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Finance {
    @Id
    @GeneratedValue
    private UUID id;
    private double montant;
    private LocalDate datePaiement;
    private boolean paye;

    @ManyToOne
    private Eleve eleve;

    @ManyToOne
    private Administrateur administrateur;
}
