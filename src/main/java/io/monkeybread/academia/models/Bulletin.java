package io.monkeybread.academia.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Bulletin {
    @Id
    @GeneratedValue
    private UUID id;
    private double moyenneGenerale;

    @ManyToOne
    private Eleve eleve;

    @OneToMany(mappedBy = "bulletin")
    private List<Note> notes;
}
