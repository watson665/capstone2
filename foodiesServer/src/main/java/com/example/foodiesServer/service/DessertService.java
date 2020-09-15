package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Dessert;
import org.springframework.http.HttpStatus;

public interface DessertService {
    Iterable<Dessert> listDessert();
    Dessert createDessert(Dessert dessert);
    Dessert getDessertById(Long id);
    HttpStatus deleteDessertById(Long id);
}

