package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Dessert;
import com.example.foodiesServer.repository.DessertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DessertServiceImp implements DessertService {
    @Autowired
    DessertRepository dessertRepository;

    @Override
    public Iterable<Dessert> listDessert() {
        return dessertRepository.findAll();
    }

    @Override
    public Dessert createDessert(Dessert dessert) {
        return dessertRepository.save(dessert);
    }

    @Override
    public Dessert getDessertById(Long id) {
        return dessertRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteDessertById(Long id) {
        dessertRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
