package org.app._100daysofspringboot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalukRepository extends JpaRepository<Taluk, Long> {

    /**
     * "Derived query": το Spring διαβάζει το ΟΝΟΜΑ της μεθόδου και φτιάχνει
     * μόνο του το SQL -> SELECT * FROM taluk WHERE distcode = ?
     * Έτσι αντικαθιστούμε το χειρόγραφο "select * from taluk where distcode=?".
     */
    List<Taluk> findByDistcode(String distcode);
}
