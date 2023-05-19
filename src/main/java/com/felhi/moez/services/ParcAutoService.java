package com.felhi.moez.services;


import com.felhi.moez.entities.ParcAuto;

import java.util.List;

public interface ParcAutoService {
    List<ParcAuto> findAll();
    void affecterParcAutoAVoiture(Long idParcAuto, Long idVoiture) ;



}
