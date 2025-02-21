package io.monkeybread.academia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cours")
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
