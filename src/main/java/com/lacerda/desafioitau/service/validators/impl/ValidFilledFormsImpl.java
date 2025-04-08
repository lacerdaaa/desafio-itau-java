package com.lacerda.desafioitau.service.validators.impl;

import com.lacerda.desafioitau.dto.TransactionRequest;
import com.lacerda.desafioitau.exception.NotFilledFieldsException;
import com.lacerda.desafioitau.service.validators.Validator;

public class ValidFilledFormsImpl implements Validator {

    @Override
    public void validate(TransactionRequest request ) {
        if(request.valor() == null || request.dataHora() == null) {
            throw new NotFilledFieldsException("One or more fields are required");
        }
    }
}
