package com.lacerda.desafioitau.service.validators.impl;

import com.lacerda.desafioitau.dto.TransactionRequest;
import com.lacerda.desafioitau.exception.NegativeValueException;
import com.lacerda.desafioitau.service.validators.Validator;

public class ValidIfValueIsNegative implements Validator {
    @Override
    public void validate(TransactionRequest request) {
        boolean isNegative = request.valor() < 0;
        if(isNegative) {
            throw new NegativeValueException("Negative values are not allowed");
        }
    }
}
