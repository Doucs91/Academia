package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.UUID;

@Entity
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
