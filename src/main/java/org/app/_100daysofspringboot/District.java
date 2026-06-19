package org.app._100daysofspringboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Ένας Νομός (District).
 *
 * @Entity  -> λέει στο Spring/Hibernate ότι αυτή η κλάση αντιστοιχεί σε
 *             έναν πίνακα της βάσης. Το όνομα του πίνακα γίνεται "district".
 * @Getter/@Setter (Lombok) -> φτιάχνει αυτόματα τις getName(), setName() κλπ.
 *             κατά το compile, για να μη τις γράφουμε με το χέρι.
 */
@Entity
@Getter
@Setter
public class District {

    // Το πρωτεύον κλειδί (primary key). Η βάση το αυξάνει μόνη της (1,2,3...).
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Το όνομα του νομού, π.χ. "Chennai".
    private String name;

    // Ο κωδικός του νομού, π.χ. "1". Με αυτόν συνδέονται τα taluk.
    private String distcode;
}
