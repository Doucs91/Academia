package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "eleve")
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
