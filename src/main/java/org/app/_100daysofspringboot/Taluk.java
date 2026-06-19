package org.app._100daysofspringboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Μια Επαρχία (Taluk). Ανήκει σε έναν νομό μέσω του distcode.
 */
@Entity
@Getter
@Setter
public class Taluk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Όνομα επαρχίας, π.χ. "Avadi".
    private String name;

    // Σε ποιον νομό ανήκει (ίδιο με District.distcode).
    private String distcode;

    // Ο δικός της κωδικός, π.χ. "12". Με αυτόν συνδέονται τα village.
    private String talukcode;
}
