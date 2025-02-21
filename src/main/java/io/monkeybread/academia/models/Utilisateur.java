package io.monkeybread.academia.models;

import io.monkeybread.academia.enums.Role;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Utilisateur {
    @Id
    @GeneratedValue
    private UUID id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;

    @Enumerated(EnumType.STRING)
    private Role role; // ENUM: ADMIN, PROFESSEUR, ELEVE, PARENT

    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @OneToMany(mappedBy = "expediteur")
    private List<Message> messagesEnvoyes;

    @OneToMany(mappedBy = "destinataire")
    private List<Message> messagesRecus;
}
