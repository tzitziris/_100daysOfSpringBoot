package org.app._100daysofspringboot;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository = η "πόρτα" προς τη βάση για τους νομούς.
 *
 * Επεκτείνοντας το JpaRepository παίρνουμε ΔΩΡΕΑΝ έτοιμες μεθόδους:
 * findAll(), findById(), save(), delete() κ.ά. — χωρίς να γράψουμε SQL.
 * Το <District, Long> σημαίνει: entity = District, τύπος του id = Long.
 */
public interface DistrictRepository extends JpaRepository<District, Long> {
}
