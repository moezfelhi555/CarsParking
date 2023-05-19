package com.felhi.moez.controllers;

import com.felhi.moez.entities.ParcAuto;
import com.felhi.moez.entities.Voiture;
import com.felhi.moez.services.ParcAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ParcAutoController {

final ParcAutoService parcAutoService;
@Autowired
    public ParcAutoController(ParcAutoService parcAutoService) {
        this.parcAutoService = parcAutoService;
    }

    @PostMapping(value = "/ParcAuto/affectation")
    public void save(@RequestParam("idVoiture") Long idVoiture, @RequestParam("idParc") Long idParc){
    parcAutoService.affecterParcAutoAVoiture(idVoiture,idParc);

    };









}
