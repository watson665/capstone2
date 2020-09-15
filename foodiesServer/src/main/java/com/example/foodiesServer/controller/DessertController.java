package com.example.foodiesServer.controller;

import com.example.foodiesServer.model.Dessert;
import com.example.foodiesServer.service.DessertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dessert")
public class DessertController {
    @Autowired
    DessertService dessertService;

    @GetMapping
    public Iterable<Dessert> listAllDessert() {
        return dessertService.listDessert();
    }

    @PostMapping
    public Dessert createDessert(@RequestBody Dessert dessert) {
        return dessertService.createDessert(dessert);
    }

    @GetMapping("/{id}")
    public Dessert getDessertById(@PathVariable Long id) {
        return dessertService.getDessertById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteDessert(@PathVariable Long id) {
        return dessertService.deleteDessertById(id);
    }
}
