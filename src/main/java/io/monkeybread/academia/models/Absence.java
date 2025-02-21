package io.monkeybread.academia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "absence")
public class Absence {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate date;
    private String motif;
    private boolean justifiee;

    @ManyToOne
    private Eleve eleve;
}
