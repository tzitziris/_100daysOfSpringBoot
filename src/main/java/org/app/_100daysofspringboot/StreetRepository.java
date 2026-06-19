package org.app._100daysofspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street, Long> {

    /**
     * -> SELECT * FROM street
     *    WHERE distcode = ? AND talukcode = ? AND villagecode = ?
     * Τρία "And" στο όνομα -> τρία AND στο SQL.
     */
    List<Street> findByDistcodeAndTalukcodeAndVillagecode(
            String distcode, String talukcode, String villagecode);
}
