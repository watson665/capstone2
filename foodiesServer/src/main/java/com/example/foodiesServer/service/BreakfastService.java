package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Breakfast;
import org.springframework.http.HttpStatus;

public interface BreakfastService {
    Iterable<Breakfast> listBreakfast();
    Breakfast createBreakfast(Breakfast breakfast);
    Breakfast getBreakfastById(Long id);
    HttpStatus deleteBreakfastById(Long id);
}
