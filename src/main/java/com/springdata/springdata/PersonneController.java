package com.springdata.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personnes")
public class PersonneController {

    private final PersonneService  personneService;

    @Autowired
    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }
    @PostMapping()
    public Personne save(@RequestBody Personne personne) {
        return personneService.savePersonne(personne);
    }

    @GetMapping("/nomPrenoms")
    public List<Personne> getPersonnesByNomPrenoms(@RequestParam String nom, @RequestParam String prenoms) {
        return personneService.findByNomOrPrenoms(nom, prenoms);
    }

    @GetMapping("/nomAndAge")
    public List<Personne> getPersonnesByNomAndAge(@RequestParam String nom, @RequestParam int age) {
        return personneService.findByNomAndAge(nom, age);
    }

    @GetMapping("/ageGreaterThan")
    public List<Personne> getPersonnesByAgeGreaterThan(@RequestParam int age) {
        return personneService.findByAgeGreaterThan(age);
    }

    @GetMapping("/nomOrderByAgeDesc")
    public List<Personne> getPersonnesByNomOrderByAgeDesc(@RequestParam String nom) {
        return personneService.findByNomOrderByAgeDesc(nom);
    }

    @GetMapping("/nomSorted")
    public List<Personne> getPersonnesByNomSorted(@RequestParam String nom, @RequestParam String sortField, @RequestParam String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortField);
        return personneService.findByNom(nom, sort);
    }
}

