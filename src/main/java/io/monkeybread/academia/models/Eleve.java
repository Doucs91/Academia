package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Eleve extends Utilisateur {
    @ManyToOne
    private Classe classe;

    @OneToMany(mappedBy = "eleve")
    private List<Note> notes;

    @OneToMany(mappedBy = "eleve")
    private List<Absence> absences;

    @OneToMany(mappedBy = "eleve")
    private List<Finance> paiements;

    @OneToMany(mappedBy = "eleve")
    private List<Bulletin> bulletins;
}
