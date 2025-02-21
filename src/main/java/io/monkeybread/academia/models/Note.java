package io.monkeybread.academia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "note")
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
