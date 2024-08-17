package com.springdata.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;
    @Autowired
    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public List<Personne> findByNomOrPrenoms(String nom, String prenoms) {
        return personneRepository.findByNomOrPrenoms(nom, prenoms);
    }

    public List<Personne> findByNomAndAge(String nom, int age) {
        return personneRepository.findByNomAndAge(nom, age);
    }

    public List<Personne> findByAgeGreaterThan(int age) {
        return personneRepository.findByAgeGreaterThan(age);
    }

    public List<Personne> findByNomOrderByAgeDesc(String nom) {
        return personneRepository.findByNomOrderByAgeDesc(nom);
    }

    public List<Personne> findByNom(String nom, Sort sort) {
        return personneRepository.findByNom(nom, sort);
    }
    public Personne savePersonne(@RequestBody Personne personne) {

        return personneRepository.save(personne);
    }
}
