package com.example.foodiesServer.service;

import com.example.foodiesServer.model.International;
import com.example.foodiesServer.repository.InternationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class InternationalServiceImp implements InternationalService {
    @Autowired
    InternationalRepository internationalRepository;

    @Override
    public Iterable<International> listInternational() {
        return internationalRepository.findAll();
    }

    @Override
    public International createInternational(International international) {
        return internationalRepository.save(international);
    }

    @Override
    public International getInternationalById(Long id) {
        return internationalRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteInternationalById(Long id) {
        internationalRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
