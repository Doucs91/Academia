package io.monkeybread.academia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matiere")
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
