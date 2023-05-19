package com.felhi.moez.services;

import com.felhi.moez.entities.Voiture;
import com.felhi.moez.repositorys.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VoitureServiceImpl implements VoitureService{



   final VoitureRepository voitureRepository;
@Autowired
    public VoitureServiceImpl(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }


    @Override
    public List<Voiture> findAll() {
        return voitureRepository.findAll();
    }

    @Override
    public void save(Voiture voiture) {
        voitureRepository.save(voiture);
    }


}
