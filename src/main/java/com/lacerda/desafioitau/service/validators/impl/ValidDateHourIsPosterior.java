package com.lacerda.desafioitau.service.validators.impl;

import com.lacerda.desafioitau.dto.TransactionRequest;
import com.lacerda.desafioitau.exception.InvalidFormException;
import com.lacerda.desafioitau.service.validators.Validator;

import java.time.OffsetDateTime;

public class ValidDateHourIsPosterior implements Validator {


    @Override
    public void validate(TransactionRequest request) {
        boolean isAfter = request.dataHora().isAfter(OffsetDateTime.now());

        if(isAfter) {
            throw new InvalidFormException("The date or time is after the current date");
        }
    }
}
