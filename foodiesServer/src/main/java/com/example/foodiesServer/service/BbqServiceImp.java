package com.example.foodiesServer.service;

import com.example.foodiesServer.model.Bbq;
import com.example.foodiesServer.repository.BbqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BbqServiceImp implements BbqService{
    @Autowired
    BbqRepository bbqRepository;

    @Override
    public Iterable<Bbq> listBbq() {
        return bbqRepository.findAll();
    }

    @Override
    public Bbq createBbq(Bbq bbq) {
        return bbqRepository.save(bbq);
    }

    @Override
    public Bbq getBbqById(Long id) {
        return bbqRepository.findById(id).get();
    }

    @Override
    public HttpStatus deleteBbqById(Long id) {
        bbqRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
