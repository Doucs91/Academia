package io.monkeybread.academia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "administrateur")
public class Administrateur extends Utilisateur {
    @OneToMany(mappedBy = "administrateur")
    private List<Finance> financesGerées;
}
