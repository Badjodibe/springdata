package com.springdata.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voitures")
public class VoitureController {

    private final VoitureService voitureService;

    @Autowired
    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GetMapping("/proprietaireNom")
    public List<Voiture> getVoituresByProprietaireNom(@RequestParam String nom) {
        return voitureService.findVoituresByProprietaireNom(nom);
    }

    @GetMapping("/proprietaireAgeGreaterThan")
    public List<Voiture> getVoituresByProprietaireAgeGreaterThan(@RequestParam int age) {
        return voitureService.findVoituresByProprietaireAgeGreaterThan(age);
    }

    @GetMapping("/yearGreaterThan")
    public List<Voiture> getVoituresByYearGreaterThan(@RequestParam int year) {
        return voitureService.findByYearGreaterThan(year);
    }

    // Méthode pour ajouter une nouvelle voiture
    @PostMapping
    public Voiture saveVoiture(@RequestBody Voiture voiture) {
        return voitureService.saveVoiture(voiture);
    }
}
