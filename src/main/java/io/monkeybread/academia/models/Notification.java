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
@Table(name = "notification")
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
