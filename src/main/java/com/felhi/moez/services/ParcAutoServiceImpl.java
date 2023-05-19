package com.felhi.moez.services;

import com.felhi.moez.entities.ParcAuto;
import com.felhi.moez.entities.Voiture;
import com.felhi.moez.repositorys.ParcAutoRepository;
import com.felhi.moez.repositorys.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ParcAutoServiceImpl implements ParcAutoService{



   final ParcAutoRepository parcAutoRepository;
   final VoitureRepository voitureRepository;

    @Autowired

    public ParcAutoServiceImpl(ParcAutoRepository parcAutoRepository, VoitureRepository voitureRepository) {
        this.parcAutoRepository = parcAutoRepository;
        this.voitureRepository = voitureRepository;
    }


    @Override
    public List<ParcAuto> findAll() {
        return null;
    }

    @Override
    public void affecterParcAutoAVoiture(Long idParcAuto, Long idVoiture) {
        Voiture voiture =  voitureRepository.findById(idVoiture).orElse(null);
        ParcAuto parcAuto = parcAutoRepository.findById(idParcAuto).orElse(null);
        if(voiture != null && parcAuto != null){
            List<Voiture> voitures = parcAuto.getVoitures();

            // Add the voiture to the list
            voitures.add(voiture);
             parcAuto.setVoitures(voitures);
             parcAutoRepository.save(parcAuto);
        }

    }
}
