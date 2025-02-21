package io.monkeybread.academia.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Examen {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate date;
    private String type; // Devoir, Examen Final, Bac Blanc
    private int coefficient;

    @ManyToOne
    private Matiere matiere;

    @OneToMany(mappedBy = "examen")
    private List<Note> notes;
}
