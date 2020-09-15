package com.example.foodiesServer.controller;

import com.example.foodiesServer.model.Bbq;
import com.example.foodiesServer.service.BbqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bbq")
public class BbqController {
    @Autowired
    BbqService bbqService;

    @GetMapping
    public Iterable<Bbq> listAllBbq() {
        return bbqService.listBbq();
    }

    @PostMapping
    public Bbq createBbq(@RequestBody Bbq bbq) {
        return bbqService.createBbq(bbq);
    }

    @GetMapping("/{id}")
    public Bbq getBbqById(@PathVariable Long id) {
        return bbqService.getBbqById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteBbq(@PathVariable Long id) {
        return bbqService.deleteBbqById(id);
    }
}
