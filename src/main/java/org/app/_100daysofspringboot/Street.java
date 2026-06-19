package org.app._100daysofspringboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Ένας Δρόμος (Street) — το 4ο επίπεδο.
 * Ανήκει σε ένα χωριό μέσω distcode + talukcode + villagecode.
 */
@Entity
@Getter
@Setter
public class Street {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Όνομα δρόμου, π.χ. "Main Street".
    private String name;

    private String distcode;
    private String talukcode;
    private String villagecode;

    // Ο δικός του κωδικός.
    private String streetcode;
}
