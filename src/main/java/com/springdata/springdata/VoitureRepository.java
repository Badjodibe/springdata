package com.springdata.springdata;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VoitureRepository extends CrudRepository<Voiture, Long> {
    @Query("SELECT v FROM Voiture v WHERE v.proprietaire.nom = :nom")
    List<Voiture> findVoituresByProprietaireNom(@Param("nom") String nom);

    @Query("SELECT v FROM Voiture v JOIN v.proprietaire p WHERE p.age > :age")
    List<Voiture> findVoituresByProprietaireAgeGreaterThan(@Param("age") int age);

    @Query("SELECT v FROM Voiture v WHERE v.year > :year")
    List<Voiture> findByAgeGreaterThan(@Param("year") int year);

}
