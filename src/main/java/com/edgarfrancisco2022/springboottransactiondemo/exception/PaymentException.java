package com.edgarfrancisco2022.springboottransactiondemo.exception;

public class PaymentException extends RuntimeException {
    public PaymentException(String message) {
        super(message);
    }
}
