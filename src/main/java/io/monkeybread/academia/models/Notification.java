package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Notification {
    @Id
    @GeneratedValue
    private UUID id;
    private String contenu;
    private LocalDateTime dateEnvoi;
    private boolean lue;

    @ManyToOne
    private Utilisateur utilisateur;
}
