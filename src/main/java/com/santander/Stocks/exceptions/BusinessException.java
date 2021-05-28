package com.santander.Stocks.exceptions;

public class BusinessException  extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}
