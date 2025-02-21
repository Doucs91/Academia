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
@Table(name = "document_administratif")
public class DocumentAdministratif {
    @Id
    @GeneratedValue
    private UUID id;
    private String type; // Certificat de scolarité, Attestation
    private String fichierPdf; // Chemin du fichier PDF généré

    @ManyToOne
    private Eleve eleve;
}
