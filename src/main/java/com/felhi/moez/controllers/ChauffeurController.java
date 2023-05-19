package com.felhi.moez.controllers;

import com.felhi.moez.entities.Chauffeur;
import com.felhi.moez.services.ChoffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ChauffeurController {

final ChoffeurService choffeurService;
    @Autowired
    public ChauffeurController(ChoffeurService choffeurService) {
        this.choffeurService = choffeurService;
    }



    @GetMapping("/chauffeur/listByParc")
    public List<Chauffeur> findchauffeurByParcAuto(@RequestParam("idParc") Long idParc) {
        return  choffeurService.listeChauffeursParParcAuto(idParc);
    }









}
