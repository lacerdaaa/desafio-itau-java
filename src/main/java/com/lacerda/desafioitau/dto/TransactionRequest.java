package com.lacerda.desafioitau.dto;

import java.time.OffsetDateTime;

public record TransactionRequest(Double valor, OffsetDateTime dataHora) {
}
