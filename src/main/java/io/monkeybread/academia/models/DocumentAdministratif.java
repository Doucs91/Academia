package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class DocumentAdministratif {
    @Id
    @GeneratedValue
    private UUID id;
    private String type; // Certificat de scolarité, Attestation
    private String fichierPdf; // Chemin du fichier PDF généré

    @ManyToOne
    private Eleve eleve;
}
