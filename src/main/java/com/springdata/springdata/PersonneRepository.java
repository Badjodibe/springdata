package com.springdata.springdata;

import org.springframework.data.repository.CrudRepository;
import  org.springframework.data.domain.Sort;

import java.util.List;

public interface PersonneRepository extends CrudRepository<Personne, Long> {

    List<Personne> findByNomOrPrenoms(String nom, String prenoms);
    List<Personne> findByNomAndAge(String nom, int age);
    List<Personne> findByAgeGreaterThan(int age);
    List<Personne> findByNomOrderByAgeDesc(String nom);
    List<Personne> findByNom(String nom, Sort sort);

}
