package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Parent extends Utilisateur {
    @OneToMany(mappedBy = "parent")
    private List<Eleve> enfants;
}
