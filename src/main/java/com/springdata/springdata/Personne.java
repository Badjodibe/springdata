package com.springdata.springdata;



import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(
        name = "Personne"
)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personne_id")
    private Long id;

    private String nom;
    private String prenoms;
    private String typePermis;
    private int age;

    @OneToMany(mappedBy = "proprietaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Voiture> voitures;


    public Personne() {
    }


    public Personne(Long id, String nom, String prenoms, String typePermis, int age, List<Voiture> voitures) {
        this.id = id;
        this.nom = nom;
        this.prenoms = prenoms;
        this.typePermis = typePermis;
        this.age = age;
        this.voitures = voitures;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(String typePermis) {
        this.typePermis = typePermis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }
}
