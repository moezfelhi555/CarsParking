package com.felhi.moez.services;

import com.felhi.moez.entities.test;
import com.felhi.moez.repositorys.testRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class testServiceImpl implements testService{



   final testRepository testRepository;

    @Autowired
    public testServiceImpl(testRepository testRepository) {
        this.testRepository = testRepository;
    }
    @Override
    public List<test> findAll() {
        return testRepository.findAll();
    }


}
