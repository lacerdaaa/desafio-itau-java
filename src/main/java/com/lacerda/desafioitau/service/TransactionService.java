package com.lacerda.desafioitau.service;

import com.lacerda.desafioitau.domain.Transaction;
import com.lacerda.desafioitau.dto.TransactionRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private final List<Transaction> transactions = new ArrayList<>();

    public void salvar( TransactionRequest request) {
        transactions.add(new Transaction(request.valor(), request.dataHora()));
    }
}
