package com.felhi.moez.services;


import com.felhi.moez.entities.Voiture;
import com.felhi.moez.entities.test;

import java.util.List;

public interface VoitureService {
    List<Voiture> findAll();
    void save (Voiture voiture );



}
