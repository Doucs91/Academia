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
@Table(name = "bulletin")
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
