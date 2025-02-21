package io.monkeybread.academia.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Matiere {
    @Id
    @GeneratedValue
    private UUID id;
    private String nom;
    private int coefficient;

    @ManyToOne
    private Professeur professeur;

    @OneToMany(mappedBy = "matiere")
    private List<Cours> cours;
}
