package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Healthy;
import com.example.foodiesServer.repository.HealthyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HealthyServiceImp implements HealthyService {
    @Autowired
    HealthyRepository healthyRepository;

    @Override
    public Iterable<Healthy> listHealthy() {
        return healthyRepository.findAll();
    }

    @Override
    public Healthy createHealthy(Healthy healthy) {
        return healthyRepository.save(healthy);
    }

    @Override
    public Healthy getHealthyById(Long id) {
        return healthyRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteHealthyById(Long id) {
        healthyRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
