package io.monkeybread.academia.models;

import io.monkeybread.academia.enums.Serie;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Classe {
    @Id
    @GeneratedValue
    private UUID id;
    private String nom;
    
    @Enumerated(EnumType.STRING)
    private Serie serie; // ENUM: L, S1, S2, STEG, etc.

    @OneToMany(mappedBy = "classe")
    private List<Eleve> eleves;

    @OneToMany(mappedBy = "classe")
    private List<Cours> cours;
}
