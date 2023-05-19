package com.felhi.moez.controllers;

import com.felhi.moez.entities.Voiture;
import com.felhi.moez.entities.test;
import com.felhi.moez.services.VoitureService;
import com.felhi.moez.services.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class VoitureController {

final VoitureService voitureService;
    @Autowired
    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }



    @GetMapping("/voiture/list")
    public List<Voiture> findAll() {
        return voitureService.findAll();
    }

    @PostMapping(value = "/voiture/create")
    public void save(@RequestBody Voiture voiture){
        voitureService.save(voiture);
    };






}
