package io.monkeybread.academia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue
    private UUID id;
    private String contenu;
    private LocalDateTime dateEnvoi;

    @ManyToOne
    private Utilisateur expediteur;

    @ManyToOne
    private Utilisateur destinataire;
}
