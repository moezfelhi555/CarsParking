package com.felhi.moez.services;

import com.felhi.moez.entities.Chauffeur;
import com.felhi.moez.entities.ParcAuto;
import com.felhi.moez.entities.Voiture;
import com.felhi.moez.repositorys.ChauffeurRepository;
import com.felhi.moez.repositorys.ParcAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ChauffeurServiceImpl implements ChoffeurService{



   final ChauffeurRepository chauffeurRepository;
   final ParcAutoRepository parcAutoRepository;

    @Autowired
    public ChauffeurServiceImpl(ChauffeurRepository chauffeurRepository, ParcAutoRepository parcAutoRepository) {
        this.chauffeurRepository = chauffeurRepository;

        this.parcAutoRepository = parcAutoRepository;
    }


    @Override
    public List<Chauffeur> listeChauffeursParParcAuto(Long idParcAuto) {
        ParcAuto p = parcAutoRepository.findById(idParcAuto).orElse(null);
List<Chauffeur> chauffeurs = new ArrayList<>();


if(p != null){
    List<Voiture> voitures = p.getVoitures();
    for ( Voiture voiture : voitures){

        chauffeurs.add(voiture.getChauffeur());

    }
}


return chauffeurs;
        }
    }

