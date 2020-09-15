package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Breakfast;
import com.example.foodiesServer.repository.BreakfastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BreakfastServiceImp implements BreakfastService {
    @Autowired
    BreakfastRepository breakfastRepository;

    @Override
    public Iterable<Breakfast> listBreakfast() {
        return breakfastRepository.findAll();
    }

    @Override
    public Breakfast createBreakfast(Breakfast breakfast) {
        return breakfastRepository.save(breakfast);
    }

    @Override
    public Breakfast getBreakfastById(Long id) {
        return breakfastRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteBreakfastById(Long id) {
        breakfastRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
