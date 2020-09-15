package com.example.foodiesServer.service;

import com.example.foodiesServer.model.American;
import org.springframework.http.HttpStatus;

public interface AmericanService {
    Iterable<American> listAmerican();
    American createAmerican(American american);
    American getAmericanById(Long id);
    HttpStatus deleteAmericanById(Long id);
}
