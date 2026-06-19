package org.app._100daysofspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VillageRepository extends JpaRepository<Village, Long> {

    /**
     * -> SELECT * FROM village WHERE distcode = ? AND talukcode = ?
     * Το "And" στο όνομα γίνεται AND στο SQL.
     */
    List<Village> findByDistcodeAndTalukcode(String distcode, String talukcode);
}
