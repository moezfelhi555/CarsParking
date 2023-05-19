package com.felhi.moez.controllers;

import com.felhi.moez.entities.test;
import com.felhi.moez.services.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class testController {

final testService testService;
@Autowired
    public testController(testService testService)
{
        this.testService = testService;
    }

    @GetMapping("/test/list")
    public List<test> findAll() {
        return testService.findAll();
    }






}
