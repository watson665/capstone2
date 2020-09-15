package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Bbq;
import org.springframework.http.HttpStatus;

public interface BbqService {
    Iterable<Bbq> listBbq();
    Bbq createBbq(Bbq bbq);
    Bbq getBbqById(Long id);
    HttpStatus deleteBbqById(Long id);
}
