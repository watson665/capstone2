package com.example.foodiesServer.service;

import com.example.foodiesServer.model.International;
import org.springframework.http.HttpStatus;

public interface InternationalService {
    Iterable<International> listInternational();
    International createInternational(International international);
    International getInternationalById(Long id);
    HttpStatus deleteInternationalById(Long id);
}
