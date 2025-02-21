package io.monkeybread.academia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue
    private UUID id;
    private String rue;
    private String ville;
    private String codePostal;
    private String pays;

    @OneToOne(mappedBy = "adresse")
    private Utilisateur utilisateur;
}
