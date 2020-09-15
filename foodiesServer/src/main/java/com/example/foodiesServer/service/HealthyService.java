package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Healthy;
import org.springframework.http.HttpStatus;

public interface HealthyService {
    Iterable<Healthy> listHealthy();
    Healthy createHealthy(Healthy healthy);
    Healthy getHealthyById(Long id);
    HttpStatus deleteHealthyById(Long id);
}
