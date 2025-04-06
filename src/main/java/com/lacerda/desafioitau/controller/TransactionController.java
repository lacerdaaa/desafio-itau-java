package com.lacerda.desafioitau.controller;

import com.lacerda.desafioitau.dto.TransactionRequest;
import com.lacerda.desafioitau.service.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transacao")
@RestController
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public void salvar(@RequestBody TransactionRequest request) {
        service.salvar(request);
    }
}

