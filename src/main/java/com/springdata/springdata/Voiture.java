package com.springdata.springdata;


import jakarta.persistence.*;

@Entity
@Table(
        name = "voiture"
)
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String model;
    private int year;

    @ManyToOne
    @JoinColumn(name = "personne_id")
    private Personne proprietaire;

    public Voiture(Long id, String marque, String model, int year, Personne proprietaire) {
        this.id = id;
        this.marque = marque;
        this.model = model;
        this.year = year;
        this.proprietaire = proprietaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }
}
