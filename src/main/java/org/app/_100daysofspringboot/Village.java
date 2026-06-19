package org.app._100daysofspringboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Ένα Χωριό (Village). Ανήκει σε μια επαρχία μέσω distcode + talukcode.
 */
@Entity
@Getter
@Setter
public class Village {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Όνομα χωριού, π.χ. "Pothur".
    private String name;

    private String distcode;
    private String talukcode;

    // Ο δικός του κωδικός.
    private String villagecode;
}
