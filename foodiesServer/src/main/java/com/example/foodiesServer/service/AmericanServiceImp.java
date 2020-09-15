package com.example.foodiesServer.service;

import com.example.foodiesServer.model.American;
import com.example.foodiesServer.repository.AmericanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AmericanServiceImp implements AmericanService {
    @Autowired
    AmericanRepository americanRepository;

    @Override
    public Iterable<American> listAmerican() {
        return americanRepository.findAll();
    }

    @Override
    public American createAmerican(American american) {
        return americanRepository.save(american);
    }

    @Override
    public American getAmericanById(Long id) {
        return americanRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteAmericanById(Long id) {
        americanRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
