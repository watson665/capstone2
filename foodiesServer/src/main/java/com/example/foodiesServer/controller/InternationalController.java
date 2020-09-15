package com.example.foodiesServer.controller;

import com.example.foodiesServer.model.International;
import com.example.foodiesServer.service.InternationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/international")
public class InternationalController {
    @Autowired
    InternationalService internationalService;

    @GetMapping
    public Iterable<International> listAllInternational() {
        return internationalService.listInternational();
    }

    @PostMapping
    public International createInternational(@RequestBody International international) {
        return internationalService.createInternational(international);
    }

    @GetMapping("/{id}")
    public International getInternationalById(@PathVariable Long id) {
        return internationalService.getInternationalById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteInternational(@PathVariable Long id) {
        return internationalService.deleteInternationalById(id);
    }
}
