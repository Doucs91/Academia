package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Administrateur extends Utilisateur {
    @OneToMany(mappedBy = "administrateur")
    private List<Finance> financesGerées;
}
