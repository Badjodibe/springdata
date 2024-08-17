package com.springdata.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService {

    private final VoitureRepository voitureRepository;
    @Autowired
    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public List<Voiture> findVoituresByProprietaireNom(String nom) {
        return voitureRepository.findVoituresByProprietaireNom(nom);
    }

    public List<Voiture> findVoituresByProprietaireAgeGreaterThan(int age) {
        return voitureRepository.findVoituresByProprietaireAgeGreaterThan(age);
    }

    public List<Voiture> findByYearGreaterThan(int year) {
        return voitureRepository.findByAgeGreaterThan(year);
    }
    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }
}
