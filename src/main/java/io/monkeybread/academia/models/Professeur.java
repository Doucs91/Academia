package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Professeur extends Utilisateur {
    @OneToMany(mappedBy = "professeur")
    private List<Matiere> matieresEnseignees;

    @OneToMany(mappedBy = "professeur")
    private List<Cours> coursEnseignes;
}
