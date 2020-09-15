package com.example.foodiesServer.controller;

import com.example.foodiesServer.model.Healthy;
import com.example.foodiesServer.service.HealthyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/healthy")
public class HealthyController {
    @Autowired
    HealthyService healthyService;

    @GetMapping
    public Iterable<Healthy> listAllHealthy() {
        return healthyService.listHealthy();
    }

    @PostMapping
    public Healthy createHealthy(@RequestBody Healthy healthy) {
        return healthyService.createHealthy(healthy);
    }

    @GetMapping("/{id}")
    public Healthy getHealthyById(@PathVariable Long id) {
        return healthyService.getHealthyById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteHealthy(@PathVariable Long id) {
        return healthyService.deleteHealthyById(id);
    }
}
