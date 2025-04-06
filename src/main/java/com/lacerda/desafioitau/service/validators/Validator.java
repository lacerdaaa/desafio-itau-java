package com.lacerda.desafioitau.service.validators;

import com.lacerda.desafioitau.dto.TransactionRequest;

public interface Validator {
    void validate(TransactionRequest request);
}
