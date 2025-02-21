package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Absence {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate date;
    private String motif;
    private boolean justifiee;

    @ManyToOne
    private Eleve eleve;
}
