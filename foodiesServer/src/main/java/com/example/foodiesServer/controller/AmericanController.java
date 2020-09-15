package com.example.foodiesServer.controller;

import com.example.foodiesServer.model.American;
import com.example.foodiesServer.service.AmericanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/american")
public class AmericanController {
    @Autowired
    AmericanService americanService;

    @GetMapping
    public Iterable<American> listAllAmerican() {
        return americanService.listAmerican();
    }

    @PostMapping
    public American createAmerican(@RequestBody American american) {
        return  americanService.createAmerican(american);
    }

    @GetMapping("/{id}")
    public American getAmericanById(@PathVariable Long id) {
        return americanService.getAmericanById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteAmerican(@PathVariable Long id) {
        return americanService.deleteAmericanById(id);
    }

}

