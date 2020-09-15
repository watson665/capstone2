package com.example.foodiesServer.controller;

import com.example.foodiesServer.model.Breakfast;
import com.example.foodiesServer.service.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/breakfast")
public class BreakfastController {
    @Autowired
    BreakfastService breakfastService;

    @GetMapping
    public Iterable<Breakfast> listAllBreakfast() {
        return breakfastService.listBreakfast();
    }

    @PostMapping
    public Breakfast createBreakfast(@RequestBody Breakfast breakfast) {
        return breakfastService.createBreakfast(breakfast);
    }

    @GetMapping("/{id}")
    public Breakfast getBreakfastById(@PathVariable Long id) {
        return  breakfastService.getBreakfastById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteBreakfast(@PathVariable Long id) {
        return breakfastService.deleteBreakfastById(id);
    }
}
