package com.lacerda.desafioitau.service;

import com.lacerda.desafioitau.domain.Transaction;
import com.lacerda.desafioitau.dto.TransactionRequest;
import com.lacerda.desafioitau.service.validators.Validator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private final List<Transaction> transactions = new ArrayList<>();
    private final List<Validator> validations;

    public TransactionService(List<Validator> validations) {
        this.validations = validations;
    }dadadasda

    public void salvar(TransactionRequest request) {
        validations.forEach(v -> v.validate(request));
        transactions.add(new Transaction(request.valor(), request.dataHora()));
    }
}
