package org.app._100daysofspringboot;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ο REST controller. Δίνει 3 endpoints κάτω από το /api.
 *
 * @RestController -> κάθε μέθοδος επιστρέφει δεδομένα (όχι σελίδα). Ο Jackson
 *                    μετατρέπει ΑΥΤΟΜΑΤΑ τις λίστες entities σε JSON. Γι' αυτό
 *                    ΔΕΝ χρειαζόμαστε json-simple όπως το αρχικό tutorial.
 *
 * Τα repositories δίνονται μέσω του constructor (Dependency Injection):
 * το Spring βλέπει τον constructor και περνάει μόνο του τα έτοιμα beans.
 */
@RestController
@RequestMapping("/api")
public class DropdownController {

    private final DistrictRepository districtRepo;
    private final TalukRepository talukRepo;
    private final VillageRepository villageRepo;
    private final StreetRepository streetRepo;

    public DropdownController(DistrictRepository districtRepo,
                              TalukRepository talukRepo,
                              VillageRepository villageRepo,
                              StreetRepository streetRepo) {
        this.districtRepo = districtRepo;
        this.talukRepo = talukRepo;
        this.villageRepo = villageRepo;
        this.streetRepo = streetRepo;
    }

    // 1) GET /api/districts -> όλοι οι νομοί. Καλείται μόλις φορτώσει η σελίδα.
    @GetMapping("/districts")
    public List<District> districts() {
        return districtRepo.findAll();
    }

    // 2) GET /api/taluks?distcode=1 -> μόνο οι επαρχίες του νομού "1".
    @GetMapping("/taluks")
    public List<Taluk> taluks(@RequestParam String distcode) {
        return talukRepo.findByDistcode(distcode);
    }

    // 3) GET /api/villages?distcode=1&talukcode=12 -> τα χωριά της επαρχίας.
    @GetMapping("/villages")
    public List<Village> villages(@RequestParam String distcode,
                                  @RequestParam String talukcode) {
        return villageRepo.findByDistcodeAndTalukcode(distcode, talukcode);
    }

    // 4) GET /api/streets?distcode=1&talukcode=12&villagecode=15
    //    -> οι δρόμοι του συγκεκριμένου χωριού.
    @GetMapping("/streets")
    public List<Street> streets(@RequestParam String distcode,
                                @RequestParam String talukcode,
                                @RequestParam String villagecode) {
        return streetRepo.findByDistcodeAndTalukcodeAndVillagecode(
                distcode, talukcode, villagecode);
    }
}
