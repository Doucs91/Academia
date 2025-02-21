package io.monkeybread.academia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "finance")
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
